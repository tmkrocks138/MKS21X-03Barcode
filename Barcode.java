
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

    private int checkSum(){
	int sum = 0;
	for(int i = 0; i < _zip.length(); i++){
	    int j = _zip.charAt(i) + 0;
	    sum += j;
	}
	sum = sum % 10;
	return sum;
    }
    public String toZip(String code){
	String  zip= "";

	return zip;
    }

    public String toString(){
	return _zip+this.checkSum()+toCode(_zip);
    }
    
}

