import java.util.Enumeration;

public class TextStatement extends Statement {

    public TextStatement(){
        _preName = "Rental Record for ";
        _posName = "\n";
        _preMovie = "\t";
        _innerMovie = "\t";
        _posMovie = "\n";
        _preTotalCharge = "Amount owed is ";
        _posTotalCharge = "\n";
        _preTotalFrequentRenterPoints = "You earned ";
        _posTotalFrequentRenterPoints  = " frequent renter points";
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