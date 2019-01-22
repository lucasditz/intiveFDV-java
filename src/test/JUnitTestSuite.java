package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	HourlyRentalTest.class,
    DailyRentalTest.class,
    WeeklyRentalTest.class,
    FamilyRentalTest.class
})
public class JUnitTestSuite {

}
