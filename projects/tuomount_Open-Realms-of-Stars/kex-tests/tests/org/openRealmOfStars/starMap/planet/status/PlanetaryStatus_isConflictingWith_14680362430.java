package org.openRealmOfStars.starMap.planet.status;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlanetaryStatus_isConflictingWith_14680362430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4791;
     Object term4884;

    public PlanetaryStatus_isConflictingWith_14680362430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4791 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term4828 = (Object[]) newArray("java.lang.String", 3);
        setField(term4791, term4791.getClass(), "statusId", "jUbSRrkrYZ");
        setField(term4791, term4791.getClass(), "name", "bWWfajKbEX");
        setField(term4791, term4791.getClass(), "description", "cAPeiZHKGJ");
        setElement(term4828, 0, "LvJFtLBaxj");
        setElement(term4828, 1, "PHvxnGHptP");
        setElement(term4828, 2, "TimdotUuNC");
        setField(term4791, term4791.getClass(), "conflictingIds", term4828);
        setIntField(term4791, term4791.getClass(), "foodBonus", -2027534003);
        setIntField(term4791, term4791.getClass(), "happinessBonus", 1063420942);
        setIntField(term4791, term4791.getClass(), "mineBonus", 1375330971);
        setIntField(term4791, term4791.getClass(), "prodBonus", -478195677);
        setIntField(term4791, term4791.getClass(), "credBonus", 972867650);
        setIntField(term4791, term4791.getClass(), "reseBonus", 1655935355);
        setBooleanField(term4791, term4791.getClass(), "hidden", true);
        setField(term4791, term4791.getClass(), "discoveryText", "PkWMRdJcBb");
        term4884 = (Object[]) newArray("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus", 5);
        Object term4885 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term4922 = (Object[]) newArray("java.lang.String", 6);
        Object term5014 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term5051 = (Object[]) newArray("java.lang.String", 5);
        Object term5131 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term5168 = (Object[]) newArray("java.lang.String", 3);
        Object term5224 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term5261 = (Object[]) newArray("java.lang.String", 7);
        Object term5365 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term5402 = (Object[]) newArray("java.lang.String", 2);
        setField(term4885, term4885.getClass(), "statusId", "jSpAteRute");
        setField(term4885, term4885.getClass(), "name", "swZVeJAxjt");
        setField(term4885, term4885.getClass(), "description", "xOcJIiQQDu");
        setElement(term4922, 0, "GVizqqzXpy");
        setElement(term4922, 1, "JqXGgAhZPl");
        setElement(term4922, 2, "jiKYgYHqIS");
        setElement(term4922, 3, "DfISiziTgG");
        setElement(term4922, 4, "XqgfKFvPSD");
        setElement(term4922, 5, "JiVRgTZvKc");
        setField(term4885, term4885.getClass(), "conflictingIds", term4922);
        setIntField(term4885, term4885.getClass(), "foodBonus", -481533957);
        setIntField(term4885, term4885.getClass(), "happinessBonus", 1240914516);
        setIntField(term4885, term4885.getClass(), "mineBonus", -1465035361);
        setIntField(term4885, term4885.getClass(), "prodBonus", 1090617576);
        setIntField(term4885, term4885.getClass(), "credBonus", -1547384488);
        setIntField(term4885, term4885.getClass(), "reseBonus", 1442160736);
        setBooleanField(term4885, term4885.getClass(), "hidden", false);
        setField(term4885, term4885.getClass(), "discoveryText", "XPKmummaqg");
        setElement(term4884, 0, term4885);
        setField(term5014, term5014.getClass(), "statusId", "BKLfkLiZTH");
        setField(term5014, term5014.getClass(), "name", "SPpkrGcPRr");
        setField(term5014, term5014.getClass(), "description", "sEccwbJKYE");
        setElement(term5051, 0, "AWRooQKkdW");
        setElement(term5051, 1, "vjxIhXHxGR");
        setElement(term5051, 2, "QXzGXbEXMu");
        setElement(term5051, 3, "qxSDVejjiY");
        setElement(term5051, 4, "xBsXSDjXYK");
        setField(term5014, term5014.getClass(), "conflictingIds", term5051);
        setIntField(term5014, term5014.getClass(), "foodBonus", 1114000454);
        setIntField(term5014, term5014.getClass(), "happinessBonus", -556405712);
        setIntField(term5014, term5014.getClass(), "mineBonus", -1772434990);
        setIntField(term5014, term5014.getClass(), "prodBonus", -1845499264);
        setIntField(term5014, term5014.getClass(), "credBonus", -505439934);
        setIntField(term5014, term5014.getClass(), "reseBonus", -344842608);
        setBooleanField(term5014, term5014.getClass(), "hidden", false);
        setField(term5014, term5014.getClass(), "discoveryText", "sEnIVFtZuQ");
        setElement(term4884, 1, term5014);
        setField(term5131, term5131.getClass(), "statusId", "ZVecLZMLHF");
        setField(term5131, term5131.getClass(), "name", "fztQhjqwdP");
        setField(term5131, term5131.getClass(), "description", "eVpkWxjuki");
        setElement(term5168, 0, "SJiQaLvSKv");
        setElement(term5168, 1, "OEXDRUKcFl");
        setElement(term5168, 2, "RYdKCNNMBR");
        setField(term5131, term5131.getClass(), "conflictingIds", term5168);
        setIntField(term5131, term5131.getClass(), "foodBonus", 941650513);
        setIntField(term5131, term5131.getClass(), "happinessBonus", 444029505);
        setIntField(term5131, term5131.getClass(), "mineBonus", -1034506028);
        setIntField(term5131, term5131.getClass(), "prodBonus", -1263114719);
        setIntField(term5131, term5131.getClass(), "credBonus", -894662986);
        setIntField(term5131, term5131.getClass(), "reseBonus", 304775596);
        setBooleanField(term5131, term5131.getClass(), "hidden", true);
        setField(term5131, term5131.getClass(), "discoveryText", "yGtHPyvYiQ");
        setElement(term4884, 2, term5131);
        setField(term5224, term5224.getClass(), "statusId", "MvRIxilFMJ");
        setField(term5224, term5224.getClass(), "name", "iNwOJRBEjp");
        setField(term5224, term5224.getClass(), "description", "XylxrMBraH");
        setElement(term5261, 0, "pORebkoRdD");
        setElement(term5261, 1, "mXGCWJDOqA");
        setElement(term5261, 2, "dpNsDgfPso");
        setElement(term5261, 3, "hCWPJQKpdc");
        setElement(term5261, 4, "WzMEhMXkKx");
        setElement(term5261, 5, "XOiDvlDhdc");
        setElement(term5261, 6, "AdxvLJhNLe");
        setField(term5224, term5224.getClass(), "conflictingIds", term5261);
        setIntField(term5224, term5224.getClass(), "foodBonus", -1347665717);
        setIntField(term5224, term5224.getClass(), "happinessBonus", -1888585309);
        setIntField(term5224, term5224.getClass(), "mineBonus", 683666002);
        setIntField(term5224, term5224.getClass(), "prodBonus", 1596213415);
        setIntField(term5224, term5224.getClass(), "credBonus", -268815336);
        setIntField(term5224, term5224.getClass(), "reseBonus", -1210583429);
        setBooleanField(term5224, term5224.getClass(), "hidden", true);
        setField(term5224, term5224.getClass(), "discoveryText", "lHfTrWKMPk");
        setElement(term4884, 3, term5224);
        setField(term5365, term5365.getClass(), "statusId", "JDaAnsVTGV");
        setField(term5365, term5365.getClass(), "name", "mLUZFTfjle");
        setField(term5365, term5365.getClass(), "description", "xIeFjkHkOe");
        setElement(term5402, 0, "SdCKLMIYnX");
        setElement(term5402, 1, "OJJtVNPyKZ");
        setField(term5365, term5365.getClass(), "conflictingIds", term5402);
        setIntField(term5365, term5365.getClass(), "foodBonus", -663691365);
        setIntField(term5365, term5365.getClass(), "happinessBonus", 339854490);
        setIntField(term5365, term5365.getClass(), "mineBonus", -615654495);
        setIntField(term5365, term5365.getClass(), "prodBonus", -1476117762);
        setIntField(term5365, term5365.getClass(), "credBonus", -341962980);
        setIntField(term5365, term5365.getClass(), "reseBonus", 1532716628);
        setBooleanField(term5365, term5365.getClass(), "hidden", false);
        setField(term5365, term5365.getClass(), "discoveryText", "AKNapTAfmD");
        setElement(term4884, 4, term5365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4791;
        args[1] = term4884;
        callMethod(klass, "isConflictingWith", argTypes, null, args);
    }

};


