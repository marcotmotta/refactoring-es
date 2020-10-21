import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public HtmlStatement(){
        _preName = "<H1>Rentals for <EM>";
        _posName = "</EM></H1><P>\n";
        _innerMovie = ": ";
        _posMovie = "<BR>\n";
        _preTotalCharge = "<P>You owe <EM>";
        _posTotalCharge = "</EM><P>\n";
        _preTotalFrequentRenterPoints = "On this rental you earned <EM>";
        _posTotalFrequentRenterPoints  = "</EM> frequent renter points<P>";
    }

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = _preName + aCustomer.getName() + _posName;
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += _preMovie + each.getMovie().getTitle()+ _innerMovie +
            String.valueOf(each.getCharge()) + _posMovie;
        }
        //add footer lines
        result += _preTotalCharge +
        String.valueOf(aCustomer.getTotalCharge()) + _posTotalCharge;
        result += _preTotalFrequentRenterPoints +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        _posTotalFrequentRenterPoints;
        return result;
    }

}