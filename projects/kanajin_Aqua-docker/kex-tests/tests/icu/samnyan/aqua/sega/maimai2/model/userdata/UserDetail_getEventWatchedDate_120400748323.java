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

public class UserDetail_getEventWatchedDate_120400748323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208081;

    public UserDetail_getEventWatchedDate_120400748323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term208085 = new Long(7950532649535587877L);
        Integer term208148 = new Integer(778368290);
        Integer term208150 = new Integer(963185413);
        Integer term208152 = new Integer(1937434591);
        Integer term208154 = new Integer(759908235);
        Integer term208156 = new Integer(-1220035028);
        Integer term208158 = new Integer(211574528);
        ArrayList term208146 = new ArrayList();
        ((ArrayList) term208146).add(term208148);
        ((ArrayList) term208146).add(term208150);
        ((ArrayList) term208146).add(term208152);
        ((ArrayList) term208146).add(term208154);
        ((ArrayList) term208146).add(term208156);
        ((ArrayList) term208146).add(term208158);
        ArrayList term208162 = new ArrayList();
        term208081 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term208083 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term208099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208104 = newInstance(Class.forName("java.time.LocalTime"));
        Object term208109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term208110 = newInstance(Class.forName("java.time.LocalDate"));
        Object term208114 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term208081, term208081.getClass(), "id", -6551984474115045703L);
        setLongField(term208083, term208083.getClass(), "id", -1914456014579434174L);
        setField(term208083, term208083.getClass(), "extId", term208085);
        setField(term208083, term208083.getClass(), "luid", "jHnoNSaWyX");
        setIntField(term208100, term208100.getClass(), "year", 2016);
        setShortField(term208100, term208100.getClass(), "month", (short) 12);
        setShortField(term208100, term208100.getClass(), "day", (short) 23);
        setField(term208099, term208099.getClass(), "date", term208100);
        setByteField(term208104, term208104.getClass(), "hour", (byte) 13);
        setByteField(term208104, term208104.getClass(), "minute", (byte) 59);
        setByteField(term208104, term208104.getClass(), "second", (byte) 38);
        setIntField(term208104, term208104.getClass(), "nano", 70840095);
        setField(term208099, term208099.getClass(), "time", term208104);
        setField(term208083, term208083.getClass(), "registerTime", term208099);
        setIntField(term208110, term208110.getClass(), "year", 2029);
        setShortField(term208110, term208110.getClass(), "month", (short) 7);
        setShortField(term208110, term208110.getClass(), "day", (short) 14);
        setField(term208109, term208109.getClass(), "date", term208110);
        setByteField(term208114, term208114.getClass(), "hour", (byte) 23);
        setByteField(term208114, term208114.getClass(), "minute", (byte) 7);
        setByteField(term208114, term208114.getClass(), "second", (byte) 5);
        setIntField(term208114, term208114.getClass(), "nano", 909102915);
        setField(term208109, term208109.getClass(), "time", term208114);
        setField(term208083, term208083.getClass(), "accessTime", term208109);
        setField(term208081, term208081.getClass(), "card", term208083);
        setField(term208081, term208081.getClass(), "userName", "mXieCFrhyD");
        setIntField(term208081, term208081.getClass(), "isNetMember", -1467577794);
        setIntField(term208081, term208081.getClass(), "iconId", 1957000422);
        setIntField(term208081, term208081.getClass(), "plateId", 1521595403);
        setIntField(term208081, term208081.getClass(), "titleId", -1211596748);
        setIntField(term208081, term208081.getClass(), "partnerId", -607616145);
        setIntField(term208081, term208081.getClass(), "frameId", -1504241847);
        setIntField(term208081, term208081.getClass(), "selectMapId", -187711145);
        setIntField(term208081, term208081.getClass(), "totalAwake", 132086207);
        setIntField(term208081, term208081.getClass(), "gradeRating", -1371629267);
        setIntField(term208081, term208081.getClass(), "musicRating", 991981146);
        setIntField(term208081, term208081.getClass(), "playerRating", 1689577386);
        setIntField(term208081, term208081.getClass(), "highestRating", 20929363);
        setIntField(term208081, term208081.getClass(), "gradeRank", 1997659725);
        setIntField(term208081, term208081.getClass(), "classRank", -982053590);
        setIntField(term208081, term208081.getClass(), "courseRank", -1866750250);
        setField(term208081, term208081.getClass(), "charaSlot", term208146);
        setField(term208081, term208081.getClass(), "charaLockSlot", term208162);
        setLongField(term208081, term208081.getClass(), "contentBit", 2889076053035999370L);
        setIntField(term208081, term208081.getClass(), "playCount", 1106745170);
        setField(term208081, term208081.getClass(), "eventWatchedDate", "qjogzMdPqm");
        setField(term208081, term208081.getClass(), "lastGameId", "PCzykpRpJn");
        setField(term208081, term208081.getClass(), "lastRomVersion", "fvFIDVcAhz");
        setField(term208081, term208081.getClass(), "lastDataVersion", "shYZfkgPnF");
        setField(term208081, term208081.getClass(), "lastLoginDate", "sEXsSAUcaT");
        setField(term208081, term208081.getClass(), "lastPlayDate", "tHEKbdDcEq");
        setIntField(term208081, term208081.getClass(), "lastPlayCredit", 1163945085);
        setIntField(term208081, term208081.getClass(), "lastPlayMode", -1127473353);
        setIntField(term208081, term208081.getClass(), "lastPlaceId", 1804045488);
        setField(term208081, term208081.getClass(), "lastPlaceName", "SyCjBcNxeU");
        setIntField(term208081, term208081.getClass(), "lastAllNetId", 557148522);
        setIntField(term208081, term208081.getClass(), "lastRegionId", 1264789417);
        setField(term208081, term208081.getClass(), "lastRegionName", "qNZegPbNeK");
        setField(term208081, term208081.getClass(), "lastClientId", "fspiwmIJbE");
        setField(term208081, term208081.getClass(), "lastCountryCode", "GsImRxMdRi");
        setIntField(term208081, term208081.getClass(), "lastSelectEMoney", -430081538);
        setIntField(term208081, term208081.getClass(), "lastSelectTicket", -146495211);
        setIntField(term208081, term208081.getClass(), "lastSelectCourse", 2134103119);
        setIntField(term208081, term208081.getClass(), "lastCountCourse", -8598624);
        setField(term208081, term208081.getClass(), "firstGameId", "RLnxTNAFPq");
        setField(term208081, term208081.getClass(), "firstRomVersion", "miSpbnDlto");
        setField(term208081, term208081.getClass(), "firstDataVersion", "iRmuWkEEGn");
        setField(term208081, term208081.getClass(), "firstPlayDate", "ghZYpAAIgU");
        setField(term208081, term208081.getClass(), "compatibleCmVersion", "AdMEFyVDZh");
        setField(term208081, term208081.getClass(), "dailyBonusDate", "yCSmzDAyfm");
        setField(term208081, term208081.getClass(), "dailyCourseBonusDate", "PLDcaPVbcR");
        setField(term208081, term208081.getClass(), "lastPairLoginDate", "ttoPxscuMS");
        setField(term208081, term208081.getClass(), "lastTrialPlayDate", "yghQggTIyt");
        setIntField(term208081, term208081.getClass(), "playVsCount", -1307724844);
        setIntField(term208081, term208081.getClass(), "playSyncCount", -711213523);
        setIntField(term208081, term208081.getClass(), "winCount", -364820822);
        setIntField(term208081, term208081.getClass(), "helpCount", -1698426889);
        setIntField(term208081, term208081.getClass(), "comboCount", 229004277);
        setLongField(term208081, term208081.getClass(), "totalDeluxscore", 8488472394277550174L);
        setLongField(term208081, term208081.getClass(), "totalBasicDeluxscore", -8768875143570831312L);
        setLongField(term208081, term208081.getClass(), "totalAdvancedDeluxscore", 199547563242621651L);
        setLongField(term208081, term208081.getClass(), "totalExpertDeluxscore", -455859287126500868L);
        setLongField(term208081, term208081.getClass(), "totalMasterDeluxscore", 607834717263740574L);
        setLongField(term208081, term208081.getClass(), "totalReMasterDeluxscore", -6195826606387081327L);
        setIntField(term208081, term208081.getClass(), "totalSync", 1552068851);
        setIntField(term208081, term208081.getClass(), "totalBasicSync", -230286512);
        setIntField(term208081, term208081.getClass(), "totalAdvancedSync", -932766163);
        setIntField(term208081, term208081.getClass(), "totalExpertSync", -1954254883);
        setIntField(term208081, term208081.getClass(), "totalMasterSync", 75824628);
        setIntField(term208081, term208081.getClass(), "totalReMasterSync", -751408969);
        setLongField(term208081, term208081.getClass(), "totalAchievement", 4224737123868689959L);
        setLongField(term208081, term208081.getClass(), "totalBasicAchievement", 1362938310875978915L);
        setLongField(term208081, term208081.getClass(), "totalAdvancedAchievement", 6158081691773104291L);
        setLongField(term208081, term208081.getClass(), "totalExpertAchievement", 6844268458017887233L);
        setLongField(term208081, term208081.getClass(), "totalMasterAchievement", -3495607289661947719L);
        setLongField(term208081, term208081.getClass(), "totalReMasterAchievement", -3061610539470350124L);
        setLongField(term208081, term208081.getClass(), "playerOldRating", -4154912416981825176L);
        setLongField(term208081, term208081.getClass(), "playerNewRating", 5193777070686642216L);
        setIntField(term208081, term208081.getClass(), "banState", 1332942351);
        setLongField(term208081, term208081.getClass(), "dateTime", 713089576019309863L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term208081, args);
    }

};


