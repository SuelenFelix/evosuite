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

public class UserDetail_getLastSelectTicket_99921030039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217131;

    public UserDetail_getLastSelectTicket_99921030039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term217135 = new Long(1442167273909860961L);
        Integer term217198 = new Integer(-619693439);
        Integer term217200 = new Integer(1886882056);
        ArrayList term217196 = new ArrayList();
        ((ArrayList) term217196).add(term217198);
        ((ArrayList) term217196).add(term217200);
        Integer term217206 = new Integer(-689559993);
        Integer term217208 = new Integer(263696243);
        Integer term217210 = new Integer(-2012537672);
        Integer term217212 = new Integer(-879433115);
        Integer term217214 = new Integer(275958841);
        Integer term217216 = new Integer(1628668899);
        Integer term217218 = new Integer(-998305335);
        ArrayList term217204 = new ArrayList();
        ((ArrayList) term217204).add(term217206);
        ((ArrayList) term217204).add(term217208);
        ((ArrayList) term217204).add(term217210);
        ((ArrayList) term217204).add(term217212);
        ((ArrayList) term217204).add(term217214);
        ((ArrayList) term217204).add(term217216);
        ((ArrayList) term217204).add(term217218);
        term217131 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term217133 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term217149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217154 = newInstance(Class.forName("java.time.LocalTime"));
        Object term217159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217164 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term217131, term217131.getClass(), "id", 3036922918288838230L);
        setLongField(term217133, term217133.getClass(), "id", -8403268438145197631L);
        setField(term217133, term217133.getClass(), "extId", term217135);
        setField(term217133, term217133.getClass(), "luid", "HXntqeXZrT");
        setIntField(term217150, term217150.getClass(), "year", 2010);
        setShortField(term217150, term217150.getClass(), "month", (short) 7);
        setShortField(term217150, term217150.getClass(), "day", (short) 21);
        setField(term217149, term217149.getClass(), "date", term217150);
        setByteField(term217154, term217154.getClass(), "hour", (byte) 12);
        setByteField(term217154, term217154.getClass(), "minute", (byte) 18);
        setByteField(term217154, term217154.getClass(), "second", (byte) 51);
        setIntField(term217154, term217154.getClass(), "nano", 209901550);
        setField(term217149, term217149.getClass(), "time", term217154);
        setField(term217133, term217133.getClass(), "registerTime", term217149);
        setIntField(term217160, term217160.getClass(), "year", 2028);
        setShortField(term217160, term217160.getClass(), "month", (short) 7);
        setShortField(term217160, term217160.getClass(), "day", (short) 2);
        setField(term217159, term217159.getClass(), "date", term217160);
        setByteField(term217164, term217164.getClass(), "hour", (byte) 23);
        setByteField(term217164, term217164.getClass(), "minute", (byte) 41);
        setByteField(term217164, term217164.getClass(), "second", (byte) 2);
        setIntField(term217164, term217164.getClass(), "nano", 187705257);
        setField(term217159, term217159.getClass(), "time", term217164);
        setField(term217133, term217133.getClass(), "accessTime", term217159);
        setField(term217131, term217131.getClass(), "card", term217133);
        setField(term217131, term217131.getClass(), "userName", "iRrzSaMGzA");
        setIntField(term217131, term217131.getClass(), "isNetMember", -1509355099);
        setIntField(term217131, term217131.getClass(), "iconId", 1568426874);
        setIntField(term217131, term217131.getClass(), "plateId", 1878621428);
        setIntField(term217131, term217131.getClass(), "titleId", -763712723);
        setIntField(term217131, term217131.getClass(), "partnerId", -953389977);
        setIntField(term217131, term217131.getClass(), "frameId", 29377926);
        setIntField(term217131, term217131.getClass(), "selectMapId", 1268654933);
        setIntField(term217131, term217131.getClass(), "totalAwake", 1996791497);
        setIntField(term217131, term217131.getClass(), "gradeRating", 1161496755);
        setIntField(term217131, term217131.getClass(), "musicRating", -228704989);
        setIntField(term217131, term217131.getClass(), "playerRating", -2028478734);
        setIntField(term217131, term217131.getClass(), "highestRating", -1685706401);
        setIntField(term217131, term217131.getClass(), "gradeRank", -420787264);
        setIntField(term217131, term217131.getClass(), "classRank", -1004890016);
        setIntField(term217131, term217131.getClass(), "courseRank", 953150729);
        setField(term217131, term217131.getClass(), "charaSlot", term217196);
        setField(term217131, term217131.getClass(), "charaLockSlot", term217204);
        setLongField(term217131, term217131.getClass(), "contentBit", 2582491632885619783L);
        setIntField(term217131, term217131.getClass(), "playCount", -1191095625);
        setField(term217131, term217131.getClass(), "eventWatchedDate", "wuMmwhKwGG");
        setField(term217131, term217131.getClass(), "lastGameId", "dTaswiAIVK");
        setField(term217131, term217131.getClass(), "lastRomVersion", "EunraCpCyk");
        setField(term217131, term217131.getClass(), "lastDataVersion", "wzxYcgqKvV");
        setField(term217131, term217131.getClass(), "lastLoginDate", "HXkIXNkVls");
        setField(term217131, term217131.getClass(), "lastPlayDate", "fCQtzMjpBx");
        setIntField(term217131, term217131.getClass(), "lastPlayCredit", -1314047245);
        setIntField(term217131, term217131.getClass(), "lastPlayMode", 287040717);
        setIntField(term217131, term217131.getClass(), "lastPlaceId", 913040044);
        setField(term217131, term217131.getClass(), "lastPlaceName", "ALRDIceDhI");
        setIntField(term217131, term217131.getClass(), "lastAllNetId", 859650427);
        setIntField(term217131, term217131.getClass(), "lastRegionId", -1565053891);
        setField(term217131, term217131.getClass(), "lastRegionName", "SXFWCGjcDu");
        setField(term217131, term217131.getClass(), "lastClientId", "IdLoQYKESx");
        setField(term217131, term217131.getClass(), "lastCountryCode", "rAGAqujSgT");
        setIntField(term217131, term217131.getClass(), "lastSelectEMoney", -33830392);
        setIntField(term217131, term217131.getClass(), "lastSelectTicket", -278532668);
        setIntField(term217131, term217131.getClass(), "lastSelectCourse", -1649190427);
        setIntField(term217131, term217131.getClass(), "lastCountCourse", 2072156352);
        setField(term217131, term217131.getClass(), "firstGameId", "aMfDWYdfgb");
        setField(term217131, term217131.getClass(), "firstRomVersion", "IVHlEeCeMo");
        setField(term217131, term217131.getClass(), "firstDataVersion", "jKnjUlnmYp");
        setField(term217131, term217131.getClass(), "firstPlayDate", "tvHTNPHMLx");
        setField(term217131, term217131.getClass(), "compatibleCmVersion", "wwTLPoVmYt");
        setField(term217131, term217131.getClass(), "dailyBonusDate", "mPBGUxrMNv");
        setField(term217131, term217131.getClass(), "dailyCourseBonusDate", "rqgsybohnG");
        setField(term217131, term217131.getClass(), "lastPairLoginDate", "NFCdVTXncV");
        setField(term217131, term217131.getClass(), "lastTrialPlayDate", "QEcxQMMQRz");
        setIntField(term217131, term217131.getClass(), "playVsCount", -681832040);
        setIntField(term217131, term217131.getClass(), "playSyncCount", 2046403159);
        setIntField(term217131, term217131.getClass(), "winCount", 796789689);
        setIntField(term217131, term217131.getClass(), "helpCount", 410056120);
        setIntField(term217131, term217131.getClass(), "comboCount", -1155278855);
        setLongField(term217131, term217131.getClass(), "totalDeluxscore", 861824247853923163L);
        setLongField(term217131, term217131.getClass(), "totalBasicDeluxscore", -5863434201422202094L);
        setLongField(term217131, term217131.getClass(), "totalAdvancedDeluxscore", -8682000970263929972L);
        setLongField(term217131, term217131.getClass(), "totalExpertDeluxscore", -307383211901007092L);
        setLongField(term217131, term217131.getClass(), "totalMasterDeluxscore", 2758375474651337206L);
        setLongField(term217131, term217131.getClass(), "totalReMasterDeluxscore", -1599530351840213478L);
        setIntField(term217131, term217131.getClass(), "totalSync", 851040269);
        setIntField(term217131, term217131.getClass(), "totalBasicSync", 148663158);
        setIntField(term217131, term217131.getClass(), "totalAdvancedSync", -1586841704);
        setIntField(term217131, term217131.getClass(), "totalExpertSync", 1177959159);
        setIntField(term217131, term217131.getClass(), "totalMasterSync", 1634229231);
        setIntField(term217131, term217131.getClass(), "totalReMasterSync", 91169479);
        setLongField(term217131, term217131.getClass(), "totalAchievement", 8251229136886682852L);
        setLongField(term217131, term217131.getClass(), "totalBasicAchievement", 8989065078057590901L);
        setLongField(term217131, term217131.getClass(), "totalAdvancedAchievement", -8900515052314357329L);
        setLongField(term217131, term217131.getClass(), "totalExpertAchievement", 1051803634212008369L);
        setLongField(term217131, term217131.getClass(), "totalMasterAchievement", 8082460776254105443L);
        setLongField(term217131, term217131.getClass(), "totalReMasterAchievement", -1521867881347536390L);
        setLongField(term217131, term217131.getClass(), "playerOldRating", 433464407057754017L);
        setLongField(term217131, term217131.getClass(), "playerNewRating", 866707654489708449L);
        setIntField(term217131, term217131.getClass(), "banState", 214492019);
        setLongField(term217131, term217131.getClass(), "dateTime", -2667466093094305338L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastSelectTicket", argTypes, term217131, args);
    }

};


