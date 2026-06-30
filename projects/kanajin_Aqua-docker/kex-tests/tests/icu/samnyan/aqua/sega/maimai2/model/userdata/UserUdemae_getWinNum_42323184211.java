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

public class UserUdemae_getWinNum_42323184211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100786;

    public UserUdemae_getWinNum_42323184211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100792 = new Long(4100236067313034103L);
        Integer term100855 = new Integer(-1016478729);
        Integer term100857 = new Integer(-206889003);
        Integer term100859 = new Integer(638046409);
        Integer term100861 = new Integer(427274898);
        Integer term100863 = new Integer(-1654552020);
        Integer term100865 = new Integer(-1049546692);
        Integer term100867 = new Integer(1397781598);
        Integer term100869 = new Integer(-44720365);
        ArrayList term100853 = new ArrayList();
        ((ArrayList) term100853).add(term100855);
        ((ArrayList) term100853).add(term100857);
        ((ArrayList) term100853).add(term100859);
        ((ArrayList) term100853).add(term100861);
        ((ArrayList) term100853).add(term100863);
        ((ArrayList) term100853).add(term100865);
        ((ArrayList) term100853).add(term100867);
        ((ArrayList) term100853).add(term100869);
        Integer term100875 = new Integer(1963632911);
        Integer term100877 = new Integer(-1100497683);
        ArrayList term100873 = new ArrayList();
        ((ArrayList) term100873).add(term100875);
        ((ArrayList) term100873).add(term100877);
        term100786 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term100788 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term100790 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100821 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100786, term100786.getClass(), "id", -8891931985436128241L);
        setLongField(term100788, term100788.getClass(), "id", -6033375404212182966L);
        setLongField(term100790, term100790.getClass(), "id", 90919700177074161L);
        setField(term100790, term100790.getClass(), "extId", term100792);
        setField(term100790, term100790.getClass(), "luid", "ndknwPavsb");
        setIntField(term100807, term100807.getClass(), "year", 2010);
        setShortField(term100807, term100807.getClass(), "month", (short) 5);
        setShortField(term100807, term100807.getClass(), "day", (short) 21);
        setField(term100806, term100806.getClass(), "date", term100807);
        setByteField(term100811, term100811.getClass(), "hour", (byte) 2);
        setByteField(term100811, term100811.getClass(), "minute", (byte) 7);
        setByteField(term100811, term100811.getClass(), "second", (byte) 22);
        setIntField(term100811, term100811.getClass(), "nano", 178273852);
        setField(term100806, term100806.getClass(), "time", term100811);
        setField(term100790, term100790.getClass(), "registerTime", term100806);
        setIntField(term100817, term100817.getClass(), "year", 2020);
        setShortField(term100817, term100817.getClass(), "month", (short) 7);
        setShortField(term100817, term100817.getClass(), "day", (short) 27);
        setField(term100816, term100816.getClass(), "date", term100817);
        setByteField(term100821, term100821.getClass(), "hour", (byte) 23);
        setByteField(term100821, term100821.getClass(), "minute", (byte) 41);
        setByteField(term100821, term100821.getClass(), "second", (byte) 32);
        setIntField(term100821, term100821.getClass(), "nano", 523353963);
        setField(term100816, term100816.getClass(), "time", term100821);
        setField(term100790, term100790.getClass(), "accessTime", term100816);
        setField(term100788, term100788.getClass(), "card", term100790);
        setField(term100788, term100788.getClass(), "userName", "XbwSBHmjuZ");
        setIntField(term100788, term100788.getClass(), "isNetMember", 530191772);
        setIntField(term100788, term100788.getClass(), "iconId", 698731814);
        setIntField(term100788, term100788.getClass(), "plateId", -1282557913);
        setIntField(term100788, term100788.getClass(), "titleId", -2080692202);
        setIntField(term100788, term100788.getClass(), "partnerId", 601982968);
        setIntField(term100788, term100788.getClass(), "frameId", -999152791);
        setIntField(term100788, term100788.getClass(), "selectMapId", 771966144);
        setIntField(term100788, term100788.getClass(), "totalAwake", -270951499);
        setIntField(term100788, term100788.getClass(), "gradeRating", 1283219056);
        setIntField(term100788, term100788.getClass(), "musicRating", 1914052513);
        setIntField(term100788, term100788.getClass(), "playerRating", -1810525034);
        setIntField(term100788, term100788.getClass(), "highestRating", -2104858494);
        setIntField(term100788, term100788.getClass(), "gradeRank", 1665727494);
        setIntField(term100788, term100788.getClass(), "classRank", 487781899);
        setIntField(term100788, term100788.getClass(), "courseRank", 322622063);
        setField(term100788, term100788.getClass(), "charaSlot", term100853);
        setField(term100788, term100788.getClass(), "charaLockSlot", term100873);
        setLongField(term100788, term100788.getClass(), "contentBit", -6590532407494439408L);
        setIntField(term100788, term100788.getClass(), "playCount", -1768300641);
        setField(term100788, term100788.getClass(), "eventWatchedDate", "vHdYsSmEmG");
        setField(term100788, term100788.getClass(), "lastGameId", "UDIVCqBmxp");
        setField(term100788, term100788.getClass(), "lastRomVersion", "npyBQorcHP");
        setField(term100788, term100788.getClass(), "lastDataVersion", "pzvYCQwkoA");
        setField(term100788, term100788.getClass(), "lastLoginDate", "TGLDiqWTkO");
        setField(term100788, term100788.getClass(), "lastPlayDate", "NwjEUxXUkk");
        setIntField(term100788, term100788.getClass(), "lastPlayCredit", 996684751);
        setIntField(term100788, term100788.getClass(), "lastPlayMode", 1947256067);
        setIntField(term100788, term100788.getClass(), "lastPlaceId", -2111706143);
        setField(term100788, term100788.getClass(), "lastPlaceName", "CFBoXISoRu");
        setIntField(term100788, term100788.getClass(), "lastAllNetId", 1147638144);
        setIntField(term100788, term100788.getClass(), "lastRegionId", 1513541114);
        setField(term100788, term100788.getClass(), "lastRegionName", "gRmiKAUyCW");
        setField(term100788, term100788.getClass(), "lastClientId", "rfXVAViErl");
        setField(term100788, term100788.getClass(), "lastCountryCode", "GcMaBtNShc");
        setIntField(term100788, term100788.getClass(), "lastSelectEMoney", 558747577);
        setIntField(term100788, term100788.getClass(), "lastSelectTicket", 532432884);
        setIntField(term100788, term100788.getClass(), "lastSelectCourse", 177236415);
        setIntField(term100788, term100788.getClass(), "lastCountCourse", -2132027119);
        setField(term100788, term100788.getClass(), "firstGameId", "kqGufqJbqf");
        setField(term100788, term100788.getClass(), "firstRomVersion", "wqMYxsvXwx");
        setField(term100788, term100788.getClass(), "firstDataVersion", "qUfONYtlAU");
        setField(term100788, term100788.getClass(), "firstPlayDate", "QMHmlsCFoq");
        setField(term100788, term100788.getClass(), "compatibleCmVersion", "JlgbBmNibu");
        setField(term100788, term100788.getClass(), "dailyBonusDate", "igRVOATJPd");
        setField(term100788, term100788.getClass(), "dailyCourseBonusDate", "DYaMGxxqDk");
        setField(term100788, term100788.getClass(), "lastPairLoginDate", "kTRmkTQpRx");
        setField(term100788, term100788.getClass(), "lastTrialPlayDate", "NmXGFQkgMo");
        setIntField(term100788, term100788.getClass(), "playVsCount", -2101727195);
        setIntField(term100788, term100788.getClass(), "playSyncCount", 2111423493);
        setIntField(term100788, term100788.getClass(), "winCount", -1312934868);
        setIntField(term100788, term100788.getClass(), "helpCount", 603212671);
        setIntField(term100788, term100788.getClass(), "comboCount", 751318072);
        setLongField(term100788, term100788.getClass(), "totalDeluxscore", -6471364019572540705L);
        setLongField(term100788, term100788.getClass(), "totalBasicDeluxscore", 3643648387583329737L);
        setLongField(term100788, term100788.getClass(), "totalAdvancedDeluxscore", 1005259662364765094L);
        setLongField(term100788, term100788.getClass(), "totalExpertDeluxscore", 7575427910876423093L);
        setLongField(term100788, term100788.getClass(), "totalMasterDeluxscore", 3175154144372494944L);
        setLongField(term100788, term100788.getClass(), "totalReMasterDeluxscore", -2463322238616422697L);
        setIntField(term100788, term100788.getClass(), "totalSync", 1804409580);
        setIntField(term100788, term100788.getClass(), "totalBasicSync", -1690181848);
        setIntField(term100788, term100788.getClass(), "totalAdvancedSync", 2007546193);
        setIntField(term100788, term100788.getClass(), "totalExpertSync", 499702355);
        setIntField(term100788, term100788.getClass(), "totalMasterSync", 1045240417);
        setIntField(term100788, term100788.getClass(), "totalReMasterSync", -1436610766);
        setLongField(term100788, term100788.getClass(), "totalAchievement", 2408965375678908663L);
        setLongField(term100788, term100788.getClass(), "totalBasicAchievement", -556491737091506400L);
        setLongField(term100788, term100788.getClass(), "totalAdvancedAchievement", 1288455695602933736L);
        setLongField(term100788, term100788.getClass(), "totalExpertAchievement", 2892238837190945228L);
        setLongField(term100788, term100788.getClass(), "totalMasterAchievement", 8629310297117297481L);
        setLongField(term100788, term100788.getClass(), "totalReMasterAchievement", -8518144174606061558L);
        setLongField(term100788, term100788.getClass(), "playerOldRating", 7380362922854751244L);
        setLongField(term100788, term100788.getClass(), "playerNewRating", -3669719821338149918L);
        setIntField(term100788, term100788.getClass(), "banState", 276963904);
        setLongField(term100788, term100788.getClass(), "dateTime", 6032481460655868293L);
        setField(term100786, term100786.getClass(), "user", term100788);
        setIntField(term100786, term100786.getClass(), "rate", -919658244);
        setIntField(term100786, term100786.getClass(), "maxRate", -1456911717);
        setIntField(term100786, term100786.getClass(), "classValue", -142288958);
        setIntField(term100786, term100786.getClass(), "maxClassValue", 1673468911);
        setIntField(term100786, term100786.getClass(), "totalWinNum", 814489039);
        setIntField(term100786, term100786.getClass(), "totalLoseNum", -1649480647);
        setIntField(term100786, term100786.getClass(), "maxWinNum", 337161557);
        setIntField(term100786, term100786.getClass(), "maxLoseNum", 2092620912);
        setIntField(term100786, term100786.getClass(), "winNum", 1992363953);
        setIntField(term100786, term100786.getClass(), "loseNum", -729452443);
        setIntField(term100786, term100786.getClass(), "npcTotalWinNum", -1036655415);
        setIntField(term100786, term100786.getClass(), "npcTotalLoseNum", 2135681292);
        setIntField(term100786, term100786.getClass(), "npcMaxWinNum", -2013011892);
        setIntField(term100786, term100786.getClass(), "npcMaxLoseNum", 1385680694);
        setIntField(term100786, term100786.getClass(), "npcWinNum", 655709162);
        setIntField(term100786, term100786.getClass(), "npcLoseNum", -1734841021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinNum", argTypes, term100786, args);
    }

};


