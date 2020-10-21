import java.util.Enumeration;

public class Statement {

    protected String
        _preName, _posName,
        _preMovie, _innerMovie, _posMovie,
        _preTotalCharge, _posTotalCharge,
        _preTotalFrequentRenterPoints, _posTotalFrequentRenterPoints;

    public Statement(){
        _preName = "";
        _posName = "";
        _preMovie = "";
        _innerMovie = "";
        _posMovie = "";
        _preTotalCharge = "";
        _posTotalCharge = "";
        _preTotalFrequentRenterPoints = "";
        _posTotalFrequentRenterPoints  = "";
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