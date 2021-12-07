package junit4;

import junit4.tests.BasicJunitTest;
import junit4.tests.OrderedTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BasicJunitTest.class, OrderedTests.class} )
public class SuiteJ {

}