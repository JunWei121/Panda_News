import com.demo.common.utils.NameUtils;
import org.junit.Test;

public class TestTools {

    @Test
    public void testName(){
        Integer i = 8 ;
        NameUtils nameUtils = new NameUtils();
        System.out.println(nameUtils.NewPhotoName(i));;
    }
}
