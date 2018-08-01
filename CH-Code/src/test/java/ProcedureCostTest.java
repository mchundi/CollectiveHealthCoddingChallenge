import org.testng.annotations.Test;
import org.testng.Assert;

public class ProcedureCostTest {

@Test
void test1(){
	Float val = new ProcedureCost().getAverageCostForProcedure("PRO-A:10||PRO-B:15||PRO-A:5||PRO-C:125||PRO-B:50||PRO-B:25","PRO-B");
	Assert.assertEquals(val,30.0,0);
}

@Test
void test2(){
	Float val = new ProcedureCost().getAverageCostForProcedure("PRO-A:10||PRO-B:15||PRO-A:5||PRO-C:125||PRO-B:25","PRO-A");
	Assert.assertEquals(val,7.5,0);
}

}
