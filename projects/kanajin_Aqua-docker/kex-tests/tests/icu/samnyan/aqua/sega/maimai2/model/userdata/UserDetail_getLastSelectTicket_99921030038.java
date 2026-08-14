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

public class UserDetail_getLastSelectTicket_99921030038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217076;

    public UserDetail_getLastSelectTicket_99921030038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term217080 = new Long(1442167273909860961L);
        Integer term217143 = new Integer(-619693439);
        Integer term217145 = new Integer(1886882056);
        ArrayList term217141 = new ArrayList();
        ((ArrayList) term217141).add(term217143);
        ((ArrayList) term217141).add(term217145);
        Integer term217151 = new Integer(-689559993);
        Integer term217153 = new Integer(263696243);
        Integer term217155 = new Integer(-2012537672);
        Integer term217157 = new Integer(-879433115);
        Integer term217159 = new Integer(275958841);
        Integer term217161 = new Integer(1628668899);
        Integer term217163 = new Integer(-998305335);
        ArrayList term217149 = new ArrayList();
        ((ArrayList) term217149).add(term217151);
        ((ArrayList) term217149).add(term217153);
        ((ArrayList) term217149).add(term217155);
        ((ArrayList) term217149).add(term217157);
        ((ArrayList) term217149).add(term217159);
        ((ArrayList) term217149).add(term217161);
        ((ArrayList) term217149).add(term217163);
        term217076 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term217078 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term217094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term217104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217109 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term217076, term217076.getClass(), "id", 3036922918288838230L);
        setLongField(term217078, term217078.getClass(), "id", -8403268438145197631L);
        setField(term217078, term217078.getClass(), "extId", term217080);
        setField(term217078, term217078.getClass(), "luid", "HXntqeXZrT");
        setIntField(term217095, term217095.getClass(), "year", 2010);
        setShortField(term217095, term217095.getClass(), "month", (short) 7);
        setShortField(term217095, term217095.getClass(), "day", (short) 21);
        setField(term217094, term217094.getClass(), "date", term217095);
        setByteField(term217099, term217099.getClass(), "hour", (byte) 12);
        setByteField(term217099, term217099.getClass(), "minute", (byte) 18);
        setByteField(term217099, term217099.getClass(), "second", (byte) 51);
        setIntField(term217099, term217099.getClass(), "nano", 209901550);
        setField(term217094, term217094.getClass(), "time", term217099);
        setField(term217078, term217078.getClass(), "registerTime", term217094);
        setIntField(term217105, term217105.getClass(), "year", 2028);
        setShortField(term217105, term217105.getClass(), "month", (short) 7);
        setShortField(term217105, term217105.getClass(), "day", (short) 2);
        setField(term217104, term217104.getClass(), "date", term217105);
        setByteField(term217109, term217109.getClass(), "hour", (byte) 23);
        setByteField(term217109, term217109.getClass(), "minute", (byte) 41);
        setByteField(term217109, term217109.getClass(), "second", (byte) 2);
        setIntField(term217109, term217109.getClass(), "nano", 187705257);
        setField(term217104, term217104.getClass(), "time", term217109);
        setField(term217078, term217078.getClass(), "accessTime", term217104);
        setField(term217076, term217076.getClass(), "card", term217078);
        setField(term217076, term217076.getClass(), "userName", "iRrzSaMGzA");
        setIntField(term217076, term217076.getClass(), "isNetMember", -1509355099);
        setIntField(term217076, term217076.getClass(), "iconId", 1568426874);
        setIntField(term217076, term217076.getClass(), "plateId", 1878621428);
        setIntField(term217076, term217076.getClass(), "titleId", -763712723);
        setIntField(term217076, term217076.getClass(), "partnerId", -953389977);
        setIntField(term217076, term217076.getClass(), "frameId", 29377926);
        setIntField(term217076, term217076.getClass(), "selectMapId", 1268654933);
        setIntField(term217076, term217076.getClass(), "totalAwake", 1996791497);
        setIntField(term217076, term217076.getClass(), "gradeRating", 1161496755);
        setIntField(term217076, term217076.getClass(), "musicRating", -228704989);
        setIntField(term217076, term217076.getClass(), "playerRating", -2028478734);
        setIntField(term217076, term217076.getClass(), "highestRating", -1685706401);
        setIntField(term217076, term217076.getClass(), "gradeRank", -420787264);
        setIntField(term217076, term217076.getClass(), "classRank", -1004890016);
        setIntField(term217076, term217076.getClass(), "courseRank", 953150729);
        setField(term217076, term217076.getClass(), "charaSlot", term217141);
        setField(term217076, term217076.getClass(), "charaLockSlot", term217149);
        setLongField(term217076, term217076.getClass(), "contentBit", 2582491632885619783L);
        setIntField(term217076, term217076.getClass(), "playCount", -1191095625);
        setField(term217076, term217076.getClass(), "eventWatchedDate", "wuMmwhKwGG");
        setField(term217076, term217076.getClass(), "lastGameId", "dTaswiAIVK");
        setField(term217076, term217076.getClass(), "lastRomVersion", "EunraCpCyk");
        setField(term217076, term217076.getClass(), "lastDataVersion", "wzxYcgqKvV");
        setField(term217076, term217076.getClass(), "lastLoginDate", "HXkIXNkVls");
        setField(term217076, term217076.getClass(), "lastPlayDate", "fCQtzMjpBx");
        setIntField(term217076, term217076.getClass(), "lastPlayCredit", -1314047245);
        setIntField(term217076, term217076.getClass(), "lastPlayMode", 287040717);
        setIntField(term217076, term217076.getClass(), "lastPlaceId", 913040044);
        setField(term217076, term217076.getClass(), "lastPlaceName", "ALRDIceDhI");
        setIntField(term217076, term217076.getClass(), "lastAllNetId", 859650427);
        setIntField(term217076, term217076.getClass(), "lastRegionId", -1565053891);
        setField(term217076, term217076.getClass(), "lastRegionName", "SXFWCGjcDu");
        setField(term217076, term217076.getClass(), "lastClientId", "IdLoQYKESx");
        setField(term217076, term217076.getClass(), "lastCountryCode", "rAGAqujSgT");
        setIntField(term217076, term217076.getClass(), "lastSelectEMoney", -33830392);
        setIntField(term217076, term217076.getClass(), "lastSelectTicket", -278532668);
        setIntField(term217076, term217076.getClass(), "lastSelectCourse", -1649190427);
        setIntField(term217076, term217076.getClass(), "lastCountCourse", 2072156352);
        setField(term217076, term217076.getClass(), "firstGameId", "aMfDWYdfgb");
        setField(term217076, term217076.getClass(), "firstRomVersion", "IVHlEeCeMo");
        setField(term217076, term217076.getClass(), "firstDataVersion", "jKnjUlnmYp");
        setField(term217076, term217076.getClass(), "firstPlayDate", "tvHTNPHMLx");
        setField(term217076, term217076.getClass(), "compatibleCmVersion", "wwTLPoVmYt");
        setField(term217076, term217076.getClass(), "dailyBonusDate", "mPBGUxrMNv");
        setField(term217076, term217076.getClass(), "dailyCourseBonusDate", "rqgsybohnG");
        setField(term217076, term217076.getClass(), "lastPairLoginDate", "NFCdVTXncV");
        setField(term217076, term217076.getClass(), "lastTrialPlayDate", "QEcxQMMQRz");
        setIntField(term217076, term217076.getClass(), "playVsCount", -681832040);
        setIntField(term217076, term217076.getClass(), "playSyncCount", 2046403159);
        setIntField(term217076, term217076.getClass(), "winCount", 796789689);
        setIntField(term217076, term217076.getClass(), "helpCount", 410056120);
        setIntField(term217076, term217076.getClass(), "comboCount", -1155278855);
        setLongField(term217076, term217076.getClass(), "totalDeluxscore", 861824247853923163L);
        setLongField(term217076, term217076.getClass(), "totalBasicDeluxscore", -5863434201422202094L);
        setLongField(term217076, term217076.getClass(), "totalAdvancedDeluxscore", -8682000970263929972L);
        setLongField(term217076, term217076.getClass(), "totalExpertDeluxscore", -307383211901007092L);
        setLongField(term217076, term217076.getClass(), "totalMasterDeluxscore", 2758375474651337206L);
        setLongField(term217076, term217076.getClass(), "totalReMasterDeluxscore", -1599530351840213478L);
        setIntField(term217076, term217076.getClass(), "totalSync", 851040269);
        setIntField(term217076, term217076.getClass(), "totalBasicSync", 148663158);
        setIntField(term217076, term217076.getClass(), "totalAdvancedSync", -1586841704);
        setIntField(term217076, term217076.getClass(), "totalExpertSync", 1177959159);
        setIntField(term217076, term217076.getClass(), "totalMasterSync", 1634229231);
        setIntField(term217076, term217076.getClass(), "totalReMasterSync", 91169479);
        setLongField(term217076, term217076.getClass(), "totalAchievement", 8251229136886682852L);
        setLongField(term217076, term217076.getClass(), "totalBasicAchievement", 8989065078057590901L);
        setLongField(term217076, term217076.getClass(), "totalAdvancedAchievement", -8900515052314357329L);
        setLongField(term217076, term217076.getClass(), "totalExpertAchievement", 1051803634212008369L);
        setLongField(term217076, term217076.getClass(), "totalMasterAchievement", 8082460776254105443L);
        setLongField(term217076, term217076.getClass(), "totalReMasterAchievement", -1521867881347536390L);
        setLongField(term217076, term217076.getClass(), "playerOldRating", 433464407057754017L);
        setLongField(term217076, term217076.getClass(), "playerNewRating", 866707654489708449L);
        setIntField(term217076, term217076.getClass(), "banState", 214492019);
        setLongField(term217076, term217076.getClass(), "dateTime", -2667466093094305338L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectTicket", argTypes, term217076, args);
    }

};


