
public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if (zip.length()!=5){
	  throw new llegalArgumentException();
      }
      _zip = zip;
      int iZip = (int) zip;
      total = 0;
      while (iZip > 0){
	  total += iZip % 10;
	  iZip /= 10;
      }
      _checkDigit = total % 10;

  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      Barcode x = new Barcode(this._zip);
      //      x = this;
      return this;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}
