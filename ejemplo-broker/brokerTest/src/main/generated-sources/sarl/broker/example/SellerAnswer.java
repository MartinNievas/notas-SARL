package broker.example;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.8")
@SarlElementType(15)
@SuppressWarnings("all")
public class SellerAnswer extends Event {
  public final double price;
  
  public final String sku;
  
  public SellerAnswer(final String string, final double price) {
    this.sku = string;
    this.price = price;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SellerAnswer other = (SellerAnswer) obj;
    if (Double.doubleToLongBits(other.price) != Double.doubleToLongBits(this.price))
      return false;
    if (!Objects.equals(this.sku, other.sku)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
    result = prime * result + Objects.hashCode(this.sku);
    return result;
  }
  
  /**
   * Returns a String representation of the SellerAnswer event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("price", this.price);
    builder.add("sku", this.sku);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 2856787L;
}
