package my.edu.utar;

public class DeliveryCharges {
int weight=0;
int distance=0;
double charges=0;

public double getDeliveryCharge(String type,int distance,int weight){
  
  if(type == "Document") {
       if(distance > 0 && distance < 30){
           if(weight < 1000)
               charges = 2.5;
           else if(weight < 5000)
               charges = 5.0;
           else if(weight < 10000)
               charges = 7.5;
        }
       else{
           if(weight < 1000)
               charges = 4.5;
           else if(weight < 5000)
               charges = 8.5;
           else if(weight < 10000)
               charges = 15.0;
       } 
  }
  else if (type == "Parcel")
         if(distance > 0 && distance < 30){
              if(weight < 1000)
                  charges = 2.5;
              else if(weight < 5000)
                  charges = 5.0;
           else if(weight < 10000)
               charges = 7.5;
        }
       else{
           if(weight < 1000)
                charges = 4.5;
           else if(weight < 5000)
                charges = 8.5;
           else if(weight < 10000)
                charges = 15.0;
       } 
  return charges;
  }
}

