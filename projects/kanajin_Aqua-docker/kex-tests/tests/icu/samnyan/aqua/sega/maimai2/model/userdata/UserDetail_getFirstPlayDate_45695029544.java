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

public class UserDetail_getFirstPlayDate_45695029544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220468;

    public UserDetail_getFirstPlayDate_45695029544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term220472 = new Long(-7283193381993602128L);
        Integer term220535 = new Integer(565614678);
        Integer term220537 = new Integer(-1248504675);
        Integer term220539 = new Integer(1366246744);
        Integer term220541 = new Integer(-369295588);
        ArrayList term220533 = new ArrayList();
        ((ArrayList) term220533).add(term220535);
        ((ArrayList) term220533).add(term220537);
        ((ArrayList) term220533).add(term220539);
        ((ArrayList) term220533).add(term220541);
        Integer term220547 = new Integer(728215296);
        Integer term220549 = new Integer(-1236147031);
        Integer term220551 = new Integer(2030051112);
        Integer term220553 = new Integer(1023614449);
        Integer term220555 = new Integer(-717220010);
        ArrayList term220545 = new ArrayList();
        ((ArrayList) term220545).add(term220547);
        ((ArrayList) term220545).add(term220549);
        ((ArrayList) term220545).add(term220551);
        ((ArrayList) term220545).add(term220553);
        ((ArrayList) term220545).add(term220555);
        term220468 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term220470 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term220486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term220487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term220491 = newInstance(Class.forName("java.time.LocalTime"));
        Object term220496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term220497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term220501 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term220468, term220468.getClass(), "id", -4158086146900353368L);
        setLongField(term220470, term220470.getClass(), "id", 464122225510516972L);
        setField(term220470, term220470.getClass(), "extId", term220472);
        setField(term220470, term220470.getClass(), "luid", "hxpGvSaYeX");
        setIntField(term220487, term220487.getClass(), "year", 2027);
        setShortField(term220487, term220487.getClass(), "month", (short) 2);
        setShortField(term220487, term220487.getClass(), "day", (short) 28);
        setField(term220486, term220486.getClass(), "date", term220487);
        setByteField(term220491, term220491.getClass(), "hour", (byte) 10);
        setByteField(term220491, term220491.getClass(), "minute", (byte) 42);
        setByteField(term220491, term220491.getClass(), "second", (byte) 49);
        setIntField(term220491, term220491.getClass(), "nano", 494945461);
        setField(term220486, term220486.getClass(), "time", term220491);
        setField(term220470, term220470.getClass(), "registerTime", term220486);
        setIntField(term220497, term220497.getClass(), "year", 2018);
        setShortField(term220497, term220497.getClass(), "month", (short) 3);
        setShortField(term220497, term220497.getClass(), "day", (short) 28);
        setField(term220496, term220496.getClass(), "date", term220497);
        setByteField(term220501, term220501.getClass(), "hour", (byte) 21);
        setByteField(term220501, term220501.getClass(), "minute", (byte) 12);
        setByteField(term220501, term220501.getClass(), "second", (byte) 31);
        setIntField(term220501, term220501.getClass(), "nano", 841920486);
        setField(term220496, term220496.getClass(), "time", term220501);
        setField(term220470, term220470.getClass(), "accessTime", term220496);
        setField(term220468, term220468.getClass(), "card", term220470);
        setField(term220468, term220468.getClass(), "userName", "mfWAasgXsv");
        setIntField(term220468, term220468.getClass(), "isNetMember", 379077201);
        setIntField(term220468, term220468.getClass(), "iconId", -1349144811);
        setIntField(term220468, term220468.getClass(), "plateId", 1721203580);
        setIntField(term220468, term220468.getClass(), "titleId", -1541596493);
        setIntField(term220468, term220468.getClass(), "partnerId", 530537769);
        setIntField(term220468, term220468.getClass(), "frameId", -1130731328);
        setIntField(term220468, term220468.getClass(), "selectMapId", 158445574);
        setIntField(term220468, term220468.getClass(), "totalAwake", 1089267384);
        setIntField(term220468, term220468.getClass(), "gradeRating", -1026397095);
        setIntField(term220468, term220468.getClass(), "musicRating", -120229920);
        setIntField(term220468, term220468.getClass(), "playerRating", 32544597);
        setIntField(term220468, term220468.getClass(), "highestRating", 2102217630);
        setIntField(term220468, term220468.getClass(), "gradeRank", -471183701);
        setIntField(term220468, term220468.getClass(), "classRank", 1854074907);
        setIntField(term220468, term220468.getClass(), "courseRank", -408616081);
        setField(term220468, term220468.getClass(), "charaSlot", term220533);
        setField(term220468, term220468.getClass(), "charaLockSlot", term220545);
        setLongField(term220468, term220468.getClass(), "contentBit", -3959172669589189450L);
        setIntField(term220468, term220468.getClass(), "playCount", 179050285);
        setField(term220468, term220468.getClass(), "eventWatchedDate", "uxmGJPsOll");
        setField(term220468, term220468.getClass(), "lastGameId", "zKlUOJCYXr");
        setField(term220468, term220468.getClass(), "lastRomVersion", "DhHThLSjdW");
        setField(term220468, term220468.getClass(), "lastDataVersion", "vpzIYawZaD");
        setField(term220468, term220468.getClass(), "lastLoginDate", "AhXnqIEoTQ");
        setField(term220468, term220468.getClass(), "lastPlayDate", "LZalYBRxIH");
        setIntField(term220468, term220468.getClass(), "lastPlayCredit", 1885793754);
        setIntField(term220468, term220468.getClass(), "lastPlayMode", -764569890);
        setIntField(term220468, term220468.getClass(), "lastPlaceId", 575186277);
        setField(term220468, term220468.getClass(), "lastPlaceName", "pgGxvxMUkz");
        setIntField(term220468, term220468.getClass(), "lastAllNetId", -1254865912);
        setIntField(term220468, term220468.getClass(), "lastRegionId", 672798038);
        setField(term220468, term220468.getClass(), "lastRegionName", "VCLZbXOFle");
        setField(term220468, term220468.getClass(), "lastClientId", "zRssYePLvB");
        setField(term220468, term220468.getClass(), "lastCountryCode", "nYIQozpOPk");
        setIntField(term220468, term220468.getClass(), "lastSelectEMoney", -1733288743);
        setIntField(term220468, term220468.getClass(), "lastSelectTicket", -258749513);
        setIntField(term220468, term220468.getClass(), "lastSelectCourse", -1844583866);
        setIntField(term220468, term220468.getClass(), "lastCountCourse", 2042786119);
        setField(term220468, term220468.getClass(), "firstGameId", "xlJAMBnfDy");
        setField(term220468, term220468.getClass(), "firstRomVersion", "bMbiivhNIZ");
        setField(term220468, term220468.getClass(), "firstDataVersion", "NyMTEHLXNW");
        setField(term220468, term220468.getClass(), "firstPlayDate", "gvSmuIFFON");
        setField(term220468, term220468.getClass(), "compatibleCmVersion", "RHHigRoqMt");
        setField(term220468, term220468.getClass(), "dailyBonusDate", "dFVGSTnsCY");
        setField(term220468, term220468.getClass(), "dailyCourseBonusDate", "jYPwQfsANN");
        setField(term220468, term220468.getClass(), "lastPairLoginDate", "sACNJcclyu");
        setField(term220468, term220468.getClass(), "lastTrialPlayDate", "uXVRWrCQNA");
        setIntField(term220468, term220468.getClass(), "playVsCount", -1283362130);
        setIntField(term220468, term220468.getClass(), "playSyncCount", 1665540853);
        setIntField(term220468, term220468.getClass(), "winCount", -1906608832);
        setIntField(term220468, term220468.getClass(), "helpCount", 1588132306);
        setIntField(term220468, term220468.getClass(), "comboCount", 1581941988);
        setLongField(term220468, term220468.getClass(), "totalDeluxscore", -8967411997264919156L);
        setLongField(term220468, term220468.getClass(), "totalBasicDeluxscore", 5507460304629667904L);
        setLongField(term220468, term220468.getClass(), "totalAdvancedDeluxscore", -6748855911016463311L);
        setLongField(term220468, term220468.getClass(), "totalExpertDeluxscore", 3049120808298443428L);
        setLongField(term220468, term220468.getClass(), "totalMasterDeluxscore", 1055228968683583583L);
        setLongField(term220468, term220468.getClass(), "totalReMasterDeluxscore", 952928310913285609L);
        setIntField(term220468, term220468.getClass(), "totalSync", -1603773271);
        setIntField(term220468, term220468.getClass(), "totalBasicSync", -1605444948);
        setIntField(term220468, term220468.getClass(), "totalAdvancedSync", 1720929948);
        setIntField(term220468, term220468.getClass(), "totalExpertSync", -943731935);
        setIntField(term220468, term220468.getClass(), "totalMasterSync", 1657200756);
        setIntField(term220468, term220468.getClass(), "totalReMasterSync", -826470678);
        setLongField(term220468, term220468.getClass(), "totalAchievement", 6147235856507936032L);
        setLongField(term220468, term220468.getClass(), "totalBasicAchievement", 4198762320430139139L);
        setLongField(term220468, term220468.getClass(), "totalAdvancedAchievement", -4397952136665726238L);
        setLongField(term220468, term220468.getClass(), "totalExpertAchievement", -3528212103681204139L);
        setLongField(term220468, term220468.getClass(), "totalMasterAchievement", 8539247422584919967L);
        setLongField(term220468, term220468.getClass(), "totalReMasterAchievement", -7829959005110820746L);
        setLongField(term220468, term220468.getClass(), "playerOldRating", -5118896749637268162L);
        setLongField(term220468, term220468.getClass(), "playerNewRating", -2659459795778467529L);
        setIntField(term220468, term220468.getClass(), "banState", -1987983732);
        setLongField(term220468, term220468.getClass(), "dateTime", -5313330886385614279L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term220468, args);
    }

};


