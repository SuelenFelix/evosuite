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

public class UserDetail_toString_460653625157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4319150;

    public UserDetail_toString_460653625157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4319154 = new Long(-5173367172520031696L);
        Integer term4319217 = new Integer(1163945085);
        Integer term4319219 = new Integer(-1127473353);
        Integer term4319221 = new Integer(1804045488);
        Integer term4319223 = new Integer(557148522);
        Integer term4319225 = new Integer(1264789417);
        Integer term4319227 = new Integer(-430081538);
        Integer term4319229 = new Integer(-146495211);
        Integer term4319231 = new Integer(2134103119);
        ArrayList term4319215 = new ArrayList();
        ((ArrayList) term4319215).add(term4319217);
        ((ArrayList) term4319215).add(term4319219);
        ((ArrayList) term4319215).add(term4319221);
        ((ArrayList) term4319215).add(term4319223);
        ((ArrayList) term4319215).add(term4319225);
        ((ArrayList) term4319215).add(term4319227);
        ((ArrayList) term4319215).add(term4319229);
        ((ArrayList) term4319215).add(term4319231);
        Integer term4319237 = new Integer(-8598624);
        Integer term4319239 = new Integer(-1307724844);
        Integer term4319241 = new Integer(-711213523);
        Integer term4319243 = new Integer(-364820822);
        Integer term4319245 = new Integer(-1698426889);
        ArrayList term4319235 = new ArrayList();
        ((ArrayList) term4319235).add(term4319237);
        ((ArrayList) term4319235).add(term4319239);
        ((ArrayList) term4319235).add(term4319241);
        ((ArrayList) term4319235).add(term4319243);
        ((ArrayList) term4319235).add(term4319245);
        term4319150 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4319152 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4319168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4319169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4319173 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4319178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4319179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4319183 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4319150, term4319150.getClass(), "id", -8035909761293313526L);
        setLongField(term4319152, term4319152.getClass(), "id", 6298276315668658489L);
        setField(term4319152, term4319152.getClass(), "extId", term4319154);
        setField(term4319152, term4319152.getClass(), "luid", "DCvgoDLfHT");
        setIntField(term4319169, term4319169.getClass(), "year", 2027);
        setShortField(term4319169, term4319169.getClass(), "month", (short) 9);
        setShortField(term4319169, term4319169.getClass(), "day", (short) 20);
        setField(term4319168, term4319168.getClass(), "date", term4319169);
        setByteField(term4319173, term4319173.getClass(), "hour", (byte) 12);
        setByteField(term4319173, term4319173.getClass(), "minute", (byte) 42);
        setByteField(term4319173, term4319173.getClass(), "second", (byte) 13);
        setIntField(term4319173, term4319173.getClass(), "nano", 17682250);
        setField(term4319168, term4319168.getClass(), "time", term4319173);
        setField(term4319152, term4319152.getClass(), "registerTime", term4319168);
        setIntField(term4319179, term4319179.getClass(), "year", 2028);
        setShortField(term4319179, term4319179.getClass(), "month", (short) 9);
        setShortField(term4319179, term4319179.getClass(), "day", (short) 2);
        setField(term4319178, term4319178.getClass(), "date", term4319179);
        setByteField(term4319183, term4319183.getClass(), "hour", (byte) 21);
        setByteField(term4319183, term4319183.getClass(), "minute", (byte) 51);
        setByteField(term4319183, term4319183.getClass(), "second", (byte) 6);
        setIntField(term4319183, term4319183.getClass(), "nano", 20297537);
        setField(term4319178, term4319178.getClass(), "time", term4319183);
        setField(term4319152, term4319152.getClass(), "accessTime", term4319178);
        setField(term4319150, term4319150.getClass(), "card", term4319152);
        setField(term4319150, term4319150.getClass(), "userName", "ZowJoNUekM");
        setIntField(term4319150, term4319150.getClass(), "isNetMember", -215073380);
        setIntField(term4319150, term4319150.getClass(), "iconId", -1200820553);
        setIntField(term4319150, term4319150.getClass(), "plateId", -1888110228);
        setIntField(term4319150, term4319150.getClass(), "titleId", 1193247404);
        setIntField(term4319150, term4319150.getClass(), "partnerId", -1864487034);
        setIntField(term4319150, term4319150.getClass(), "frameId", -1251808104);
        setIntField(term4319150, term4319150.getClass(), "selectMapId", 1714267827);
        setIntField(term4319150, term4319150.getClass(), "totalAwake", -893062579);
        setIntField(term4319150, term4319150.getClass(), "gradeRating", -808144930);
        setIntField(term4319150, term4319150.getClass(), "musicRating", -1079824360);
        setIntField(term4319150, term4319150.getClass(), "playerRating", -1055566479);
        setIntField(term4319150, term4319150.getClass(), "highestRating", -826905033);
        setIntField(term4319150, term4319150.getClass(), "gradeRank", 1051788757);
        setIntField(term4319150, term4319150.getClass(), "classRank", 666588655);
        setIntField(term4319150, term4319150.getClass(), "courseRank", 1025668385);
        setField(term4319150, term4319150.getClass(), "charaSlot", term4319215);
        setField(term4319150, term4319150.getClass(), "charaLockSlot", term4319235);
        setLongField(term4319150, term4319150.getClass(), "contentBit", 228501598719042647L);
        setIntField(term4319150, term4319150.getClass(), "playCount", -1094462625);
        setField(term4319150, term4319150.getClass(), "eventWatchedDate", "PIILIxwYBT");
        setField(term4319150, term4319150.getClass(), "lastGameId", "PnfQBwquDd");
        setField(term4319150, term4319150.getClass(), "lastRomVersion", "stcjkVuBDX");
        setField(term4319150, term4319150.getClass(), "lastDataVersion", "akulRXWqRR");
        setField(term4319150, term4319150.getClass(), "lastLoginDate", "uddpHJhLNt");
        setField(term4319150, term4319150.getClass(), "lastPlayDate", "FjphQKHhxN");
        setIntField(term4319150, term4319150.getClass(), "lastPlayCredit", 860385926);
        setIntField(term4319150, term4319150.getClass(), "lastPlayMode", -1739191243);
        setIntField(term4319150, term4319150.getClass(), "lastPlaceId", 1279870974);
        setField(term4319150, term4319150.getClass(), "lastPlaceName", "XgTHBDHsis");
        setIntField(term4319150, term4319150.getClass(), "lastAllNetId", 1838088431);
        setIntField(term4319150, term4319150.getClass(), "lastRegionId", -278003911);
        setField(term4319150, term4319150.getClass(), "lastRegionName", "egecFuYzdp");
        setField(term4319150, term4319150.getClass(), "lastClientId", "FvXFtejbHZ");
        setField(term4319150, term4319150.getClass(), "lastCountryCode", "rzweLzDxWY");
        setIntField(term4319150, term4319150.getClass(), "lastSelectEMoney", 1632566617);
        setIntField(term4319150, term4319150.getClass(), "lastSelectTicket", 1124001004);
        setIntField(term4319150, term4319150.getClass(), "lastSelectCourse", 1382334042);
        setIntField(term4319150, term4319150.getClass(), "lastCountCourse", 1198681061);
        setField(term4319150, term4319150.getClass(), "firstGameId", "YPrivBTKUt");
        setField(term4319150, term4319150.getClass(), "firstRomVersion", "hLSHgzNdfP");
        setField(term4319150, term4319150.getClass(), "firstDataVersion", "RNCGgACIMY");
        setField(term4319150, term4319150.getClass(), "firstPlayDate", "CKHYDbPkog");
        setField(term4319150, term4319150.getClass(), "compatibleCmVersion", "iITFvSwRAo");
        setField(term4319150, term4319150.getClass(), "dailyBonusDate", "scdUliZCLP");
        setField(term4319150, term4319150.getClass(), "dailyCourseBonusDate", "LAjVfRfRgZ");
        setField(term4319150, term4319150.getClass(), "lastPairLoginDate", "mKTqxyCEvj");
        setField(term4319150, term4319150.getClass(), "lastTrialPlayDate", "CSIyuvImnY");
        setIntField(term4319150, term4319150.getClass(), "playVsCount", -1507461545);
        setIntField(term4319150, term4319150.getClass(), "playSyncCount", -477940841);
        setIntField(term4319150, term4319150.getClass(), "winCount", -109744463);
        setIntField(term4319150, term4319150.getClass(), "helpCount", -2066349578);
        setIntField(term4319150, term4319150.getClass(), "comboCount", -339624919);
        setLongField(term4319150, term4319150.getClass(), "totalDeluxscore", 5033020734902635222L);
        setLongField(term4319150, term4319150.getClass(), "totalBasicDeluxscore", 8923152142766750845L);
        setLongField(term4319150, term4319150.getClass(), "totalAdvancedDeluxscore", -2028837904821116750L);
        setLongField(term4319150, term4319150.getClass(), "totalExpertDeluxscore", -6122622548737697597L);
        setLongField(term4319150, term4319150.getClass(), "totalMasterDeluxscore", -1076750748188378042L);
        setLongField(term4319150, term4319150.getClass(), "totalReMasterDeluxscore", 4249889124780807951L);
        setIntField(term4319150, term4319150.getClass(), "totalSync", 613156572);
        setIntField(term4319150, term4319150.getClass(), "totalBasicSync", 1620387125);
        setIntField(term4319150, term4319150.getClass(), "totalAdvancedSync", -956412079);
        setIntField(term4319150, term4319150.getClass(), "totalExpertSync", 1803961470);
        setIntField(term4319150, term4319150.getClass(), "totalMasterSync", -425920152);
        setIntField(term4319150, term4319150.getClass(), "totalReMasterSync", -1123029204);
        setLongField(term4319150, term4319150.getClass(), "totalAchievement", -1182720350580301241L);
        setLongField(term4319150, term4319150.getClass(), "totalBasicAchievement", -1307132557400314196L);
        setLongField(term4319150, term4319150.getClass(), "totalAdvancedAchievement", 3919069814567431174L);
        setLongField(term4319150, term4319150.getClass(), "totalExpertAchievement", 803272221840489036L);
        setLongField(term4319150, term4319150.getClass(), "totalMasterAchievement", -2061705160851256552L);
        setLongField(term4319150, term4319150.getClass(), "totalReMasterAchievement", -3939249811747103151L);
        setLongField(term4319150, term4319150.getClass(), "playerOldRating", 6569331624674403129L);
        setLongField(term4319150, term4319150.getClass(), "playerNewRating", 3431172595840585543L);
        setIntField(term4319150, term4319150.getClass(), "banState", -530707052);
        setLongField(term4319150, term4319150.getClass(), "dateTime", 3422847455303999085L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4319150, args);
    }

};


