// placeholder
public class Cell {
  
  private ????? value; //Finish this part up
  
  public Cell c1 = new Cell(){
    }//Finish this part up
  
  public Cell c2 = new Cell(?????? input) { //Finish this part up
  value = input;
  }
  
  public double getValue() {
    return value;
  }
  
  public String toDisplay() {
    //truncate String to length -1 and display >
    int columnWidth = 12;
    String output = value;
    if(output.length() > columnWidth) {
      output = output.substring(0, columnWidth - 1) + ">";
    }
    //if length is odd pad end to even length
    if(output.length() % 2 == 1) {
      output += " ";
    }
    //adjust pad to center of cell
    while(output.length < columnWidth) {
      output = " " + output + " ";
    }
    return output;
  }
  
  public String toString() {
    String result = getValue();
    if(result.length() == 0) {
      result = "<empty>";
    } else {
      result = "\"" + result + "\"";
    }
    return result;
  }
  
  public void setValue(String input) {
    Date date;
    try {
      date = dateFormat.parse(input);
      input = dateFormat.format(date);
    }
    catch (Exception e) {
      input = " ";
    }
    super.setValue(input);
  }
}
