package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserAct_equals_91531673719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11483;
     Object term11855;

    public UserAct_equals_91531673719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11489 = new Long(8428634514691209827L);
        Integer term11552 = new Integer(1398204340);
        Integer term11554 = new Integer(229204365);
        Integer term11556 = new Integer(-461771056);
        Integer term11558 = new Integer(-243422082);
        ArrayList term11550 = new ArrayList();
        ((ArrayList) term11550).add(term11552);
        ((ArrayList) term11550).add(term11554);
        ((ArrayList) term11550).add(term11556);
        ((ArrayList) term11550).add(term11558);
        Integer term11564 = new Integer(1384592638);
        Integer term11566 = new Integer(-1002370457);
        Integer term11568 = new Integer(-2014576105);
        Integer term11570 = new Integer(1296895584);
        Integer term11572 = new Integer(628918458);
        Integer term11574 = new Integer(-1274456137);
        Integer term11576 = new Integer(1041916673);
        Integer term11578 = new Integer(-601863069);
        ArrayList term11562 = new ArrayList();
        ((ArrayList) term11562).add(term11564);
        ((ArrayList) term11562).add(term11566);
        ((ArrayList) term11562).add(term11568);
        ((ArrayList) term11562).add(term11570);
        ((ArrayList) term11562).add(term11572);
        ((ArrayList) term11562).add(term11574);
        ((ArrayList) term11562).add(term11576);
        ((ArrayList) term11562).add(term11578);
        term11483 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term11485 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term11487 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term11503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11518 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term11483, term11483.getClass(), "id", 9174730812791817537L);
        setLongField(term11485, term11485.getClass(), "id", 8024477479047145752L);
        setLongField(term11487, term11487.getClass(), "id", 7006402814669334483L);
        setField(term11487, term11487.getClass(), "extId", term11489);
        setField(term11487, term11487.getClass(), "luid", "EusenEbIoF");
        setIntField(term11504, term11504.getClass(), "year", 2015);
        setShortField(term11504, term11504.getClass(), "month", (short) 12);
        setShortField(term11504, term11504.getClass(), "day", (short) 23);
        setField(term11503, term11503.getClass(), "date", term11504);
        setByteField(term11508, term11508.getClass(), "hour", (byte) 14);
        setByteField(term11508, term11508.getClass(), "minute", (byte) 17);
        setByteField(term11508, term11508.getClass(), "second", (byte) 50);
        setIntField(term11508, term11508.getClass(), "nano", 325544804);
        setField(term11503, term11503.getClass(), "time", term11508);
        setField(term11487, term11487.getClass(), "registerTime", term11503);
        setIntField(term11514, term11514.getClass(), "year", 2027);
        setShortField(term11514, term11514.getClass(), "month", (short) 11);
        setShortField(term11514, term11514.getClass(), "day", (short) 8);
        setField(term11513, term11513.getClass(), "date", term11514);
        setByteField(term11518, term11518.getClass(), "hour", (byte) 11);
        setByteField(term11518, term11518.getClass(), "minute", (byte) 59);
        setByteField(term11518, term11518.getClass(), "second", (byte) 14);
        setIntField(term11518, term11518.getClass(), "nano", 322375591);
        setField(term11513, term11513.getClass(), "time", term11518);
        setField(term11487, term11487.getClass(), "accessTime", term11513);
        setField(term11485, term11485.getClass(), "card", term11487);
        setField(term11485, term11485.getClass(), "userName", "SScVQYSvWH");
        setIntField(term11485, term11485.getClass(), "isNetMember", -337504086);
        setIntField(term11485, term11485.getClass(), "iconId", 2074130991);
        setIntField(term11485, term11485.getClass(), "plateId", 532588266);
        setIntField(term11485, term11485.getClass(), "titleId", -1286686332);
        setIntField(term11485, term11485.getClass(), "partnerId", -284885486);
        setIntField(term11485, term11485.getClass(), "frameId", 1791984446);
        setIntField(term11485, term11485.getClass(), "selectMapId", 804070622);
        setIntField(term11485, term11485.getClass(), "totalAwake", 1850364894);
        setIntField(term11485, term11485.getClass(), "gradeRating", 915367534);
        setIntField(term11485, term11485.getClass(), "musicRating", 1949983666);
        setIntField(term11485, term11485.getClass(), "playerRating", 154111854);
        setIntField(term11485, term11485.getClass(), "highestRating", 710986341);
        setIntField(term11485, term11485.getClass(), "gradeRank", -873958002);
        setIntField(term11485, term11485.getClass(), "classRank", -1780848958);
        setIntField(term11485, term11485.getClass(), "courseRank", 1235045850);
        setField(term11485, term11485.getClass(), "charaSlot", term11550);
        setField(term11485, term11485.getClass(), "charaLockSlot", term11562);
        setLongField(term11485, term11485.getClass(), "contentBit", -4003544865306793676L);
        setIntField(term11485, term11485.getClass(), "playCount", -75143033);
        setField(term11485, term11485.getClass(), "eventWatchedDate", "MnovcqFhCl");
        setField(term11485, term11485.getClass(), "lastGameId", "qYtAeLzOhW");
        setField(term11485, term11485.getClass(), "lastRomVersion", "tJzmOfcUnY");
        setField(term11485, term11485.getClass(), "lastDataVersion", "TKlccZUpjz");
        setField(term11485, term11485.getClass(), "lastLoginDate", "GGzwMoHZXC");
        setField(term11485, term11485.getClass(), "lastPlayDate", "IpmgwHTgnG");
        setIntField(term11485, term11485.getClass(), "lastPlayCredit", 797015478);
        setIntField(term11485, term11485.getClass(), "lastPlayMode", 717574276);
        setIntField(term11485, term11485.getClass(), "lastPlaceId", 1795369860);
        setField(term11485, term11485.getClass(), "lastPlaceName", "tIpkeYIezR");
        setIntField(term11485, term11485.getClass(), "lastAllNetId", -570164389);
        setIntField(term11485, term11485.getClass(), "lastRegionId", 43200329);
        setField(term11485, term11485.getClass(), "lastRegionName", "YkZtEtthvz");
        setField(term11485, term11485.getClass(), "lastClientId", "dwlZSxlXOo");
        setField(term11485, term11485.getClass(), "lastCountryCode", "lKrEAkypza");
        setIntField(term11485, term11485.getClass(), "lastSelectEMoney", 998679955);
        setIntField(term11485, term11485.getClass(), "lastSelectTicket", 953741504);
        setIntField(term11485, term11485.getClass(), "lastSelectCourse", 1389452261);
        setIntField(term11485, term11485.getClass(), "lastCountCourse", 1615957955);
        setField(term11485, term11485.getClass(), "firstGameId", "KtuuNAqGCQ");
        setField(term11485, term11485.getClass(), "firstRomVersion", "OGQsfjmReM");
        setField(term11485, term11485.getClass(), "firstDataVersion", "YsUtbngnRO");
        setField(term11485, term11485.getClass(), "firstPlayDate", "JisaWUxcNb");
        setField(term11485, term11485.getClass(), "compatibleCmVersion", "NxgmYPzWCI");
        setField(term11485, term11485.getClass(), "dailyBonusDate", "SqjyKmayBx");
        setField(term11485, term11485.getClass(), "dailyCourseBonusDate", "XjDhvToxJy");
        setField(term11485, term11485.getClass(), "lastPairLoginDate", "nxSTJflLQy");
        setField(term11485, term11485.getClass(), "lastTrialPlayDate", "FlHzxEfFzI");
        setIntField(term11485, term11485.getClass(), "playVsCount", 1779370220);
        setIntField(term11485, term11485.getClass(), "playSyncCount", -1716046610);
        setIntField(term11485, term11485.getClass(), "winCount", 65264024);
        setIntField(term11485, term11485.getClass(), "helpCount", -252449812);
        setIntField(term11485, term11485.getClass(), "comboCount", -1885268968);
        setLongField(term11485, term11485.getClass(), "totalDeluxscore", -769824408235898287L);
        setLongField(term11485, term11485.getClass(), "totalBasicDeluxscore", -2828343143039517941L);
        setLongField(term11485, term11485.getClass(), "totalAdvancedDeluxscore", 2809748481176687920L);
        setLongField(term11485, term11485.getClass(), "totalExpertDeluxscore", 4012955251407483889L);
        setLongField(term11485, term11485.getClass(), "totalMasterDeluxscore", -4058686252500969842L);
        setLongField(term11485, term11485.getClass(), "totalReMasterDeluxscore", 6077991958696417121L);
        setIntField(term11485, term11485.getClass(), "totalSync", 277855691);
        setIntField(term11485, term11485.getClass(), "totalBasicSync", 675891483);
        setIntField(term11485, term11485.getClass(), "totalAdvancedSync", -317900470);
        setIntField(term11485, term11485.getClass(), "totalExpertSync", -979568);
        setIntField(term11485, term11485.getClass(), "totalMasterSync", -1422131197);
        setIntField(term11485, term11485.getClass(), "totalReMasterSync", -20399281);
        setLongField(term11485, term11485.getClass(), "totalAchievement", -5004803270846838598L);
        setLongField(term11485, term11485.getClass(), "totalBasicAchievement", -8211859616692114655L);
        setLongField(term11485, term11485.getClass(), "totalAdvancedAchievement", 7487838449539103993L);
        setLongField(term11485, term11485.getClass(), "totalExpertAchievement", 7010148136855890340L);
        setLongField(term11485, term11485.getClass(), "totalMasterAchievement", -6771377873268167033L);
        setLongField(term11485, term11485.getClass(), "totalReMasterAchievement", 1278107327214302894L);
        setLongField(term11485, term11485.getClass(), "playerOldRating", 3104349415269466587L);
        setLongField(term11485, term11485.getClass(), "playerNewRating", -7423063312741500355L);
        setIntField(term11485, term11485.getClass(), "banState", -830170410);
        setLongField(term11485, term11485.getClass(), "dateTime", -8992404862613425105L);
        setField(term11483, term11483.getClass(), "user", term11485);
        setIntField(term11483, term11483.getClass(), "kind", -1742790308);
        setIntField(term11483, term11483.getClass(), "activityId", -1592093430);
        setLongField(term11483, term11483.getClass(), "sortNumber", 3103198349031409063L);
        setIntField(term11483, term11483.getClass(), "param1", 1178214545);
        setIntField(term11483, term11483.getClass(), "param2", -985334541);
        setIntField(term11483, term11483.getClass(), "param3", -1870004228);
        setIntField(term11483, term11483.getClass(), "param4", 380484139);
        term11855 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11855;
        callMethod(klass, "equals", argTypes, term11483, args);
    }

};


