
public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
       /*
      1  :::||   
      2  ::|:|
      3  ::||:
      4  :|::|
      5  :|:|:
      6  :||::
      7  |:::|
      8  |::|:
      9  |:|::
      0  ||::: 
    */
    private String[] bar = {"||:::",":::||","::|:|","::||:",":|::|", ":|:|:",":||::","|:::|","|::|:","|:|::"};
// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if (zip.length()!=5){
	  throw new IllegalArgumentException();
      }
      _zip = zip;

  }
  public String toCode(String zip){
    if (zip.length()!=5){	  
	 throw new IllegalArgumentException();
    }
    String code = "|"; 
    try{
	for (int i=0; i<zip.length(); i++){
	    code+=bar[(int)zip.charAt(i)];
	}
    }
    catch(IllegalArgumentException e){
         System.out.println("Invalid Zip");
    }
    return code +"|";
  }

 public int compareTo(Barcode other){
    int x = this.compareTo(other);
    return x;
 }
/*
// postcondition: Creates a copy of a bar code.

// postcondition: computes and returns the check sum for _zip
  private int checkSum(){}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
*/
    
}

