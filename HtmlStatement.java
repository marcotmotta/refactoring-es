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

}