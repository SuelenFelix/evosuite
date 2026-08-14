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

public class UserDetail_getPlayerNewRating_29211847874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237424;

    public UserDetail_getPlayerNewRating_29211847874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term237428 = new Long(-3231440836116263235L);
        ArrayList term237489 = new ArrayList();
        Integer term237495 = new Integer(-1307655183);
        Integer term237497 = new Integer(1309934432);
        ArrayList term237493 = new ArrayList();
        ((ArrayList) term237493).add(term237495);
        ((ArrayList) term237493).add(term237497);
        term237424 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term237426 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term237442 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term237443 = newInstance(Class.forName("java.time.LocalDate"));
        Object term237447 = newInstance(Class.forName("java.time.LocalTime"));
        Object term237452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term237453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term237457 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term237424, term237424.getClass(), "id", 2919393911207262117L);
        setLongField(term237426, term237426.getClass(), "id", 4656718360537135113L);
        setField(term237426, term237426.getClass(), "extId", term237428);
        setField(term237426, term237426.getClass(), "luid", "udgIsSKFRr");
        setIntField(term237443, term237443.getClass(), "year", 2019);
        setShortField(term237443, term237443.getClass(), "month", (short) 10);
        setShortField(term237443, term237443.getClass(), "day", (short) 25);
        setField(term237442, term237442.getClass(), "date", term237443);
        setByteField(term237447, term237447.getClass(), "hour", (byte) 18);
        setByteField(term237447, term237447.getClass(), "minute", (byte) 58);
        setByteField(term237447, term237447.getClass(), "second", (byte) 55);
        setIntField(term237447, term237447.getClass(), "nano", 407840282);
        setField(term237442, term237442.getClass(), "time", term237447);
        setField(term237426, term237426.getClass(), "registerTime", term237442);
        setIntField(term237453, term237453.getClass(), "year", 2012);
        setShortField(term237453, term237453.getClass(), "month", (short) 4);
        setShortField(term237453, term237453.getClass(), "day", (short) 23);
        setField(term237452, term237452.getClass(), "date", term237453);
        setByteField(term237457, term237457.getClass(), "hour", (byte) 8);
        setByteField(term237457, term237457.getClass(), "minute", (byte) 11);
        setByteField(term237457, term237457.getClass(), "second", (byte) 45);
        setIntField(term237457, term237457.getClass(), "nano", 286907697);
        setField(term237452, term237452.getClass(), "time", term237457);
        setField(term237426, term237426.getClass(), "accessTime", term237452);
        setField(term237424, term237424.getClass(), "card", term237426);
        setField(term237424, term237424.getClass(), "userName", "aOLivtFpQk");
        setIntField(term237424, term237424.getClass(), "isNetMember", 365154265);
        setIntField(term237424, term237424.getClass(), "iconId", -199029048);
        setIntField(term237424, term237424.getClass(), "plateId", -1738730758);
        setIntField(term237424, term237424.getClass(), "titleId", 252807194);
        setIntField(term237424, term237424.getClass(), "partnerId", -1970748295);
        setIntField(term237424, term237424.getClass(), "frameId", -970919712);
        setIntField(term237424, term237424.getClass(), "selectMapId", 644708268);
        setIntField(term237424, term237424.getClass(), "totalAwake", -171593389);
        setIntField(term237424, term237424.getClass(), "gradeRating", 1617777059);
        setIntField(term237424, term237424.getClass(), "musicRating", 1582718344);
        setIntField(term237424, term237424.getClass(), "playerRating", 122167659);
        setIntField(term237424, term237424.getClass(), "highestRating", -1126970397);
        setIntField(term237424, term237424.getClass(), "gradeRank", 1728431100);
        setIntField(term237424, term237424.getClass(), "classRank", -869897258);
        setIntField(term237424, term237424.getClass(), "courseRank", 962362818);
        setField(term237424, term237424.getClass(), "charaSlot", term237489);
        setField(term237424, term237424.getClass(), "charaLockSlot", term237493);
        setLongField(term237424, term237424.getClass(), "contentBit", 1208024088168011848L);
        setIntField(term237424, term237424.getClass(), "playCount", -1177115437);
        setField(term237424, term237424.getClass(), "eventWatchedDate", "ZOLKnxBnCK");
        setField(term237424, term237424.getClass(), "lastGameId", "NfgTNwHaCV");
        setField(term237424, term237424.getClass(), "lastRomVersion", "XAejapRogI");
        setField(term237424, term237424.getClass(), "lastDataVersion", "tjtosnRhZg");
        setField(term237424, term237424.getClass(), "lastLoginDate", "fAebRNsXjr");
        setField(term237424, term237424.getClass(), "lastPlayDate", "EQODXZdfZL");
        setIntField(term237424, term237424.getClass(), "lastPlayCredit", -488175128);
        setIntField(term237424, term237424.getClass(), "lastPlayMode", -663945631);
        setIntField(term237424, term237424.getClass(), "lastPlaceId", 721797064);
        setField(term237424, term237424.getClass(), "lastPlaceName", "QScgqkQatE");
        setIntField(term237424, term237424.getClass(), "lastAllNetId", 1046449580);
        setIntField(term237424, term237424.getClass(), "lastRegionId", 371812655);
        setField(term237424, term237424.getClass(), "lastRegionName", "vLgGnXxXre");
        setField(term237424, term237424.getClass(), "lastClientId", "AccEBvkfGm");
        setField(term237424, term237424.getClass(), "lastCountryCode", "RXhiAWuHdv");
        setIntField(term237424, term237424.getClass(), "lastSelectEMoney", 1065841171);
        setIntField(term237424, term237424.getClass(), "lastSelectTicket", 1086310493);
        setIntField(term237424, term237424.getClass(), "lastSelectCourse", 1541036402);
        setIntField(term237424, term237424.getClass(), "lastCountCourse", 1185835742);
        setField(term237424, term237424.getClass(), "firstGameId", "ERohGnSYkC");
        setField(term237424, term237424.getClass(), "firstRomVersion", "yMgWhzgQld");
        setField(term237424, term237424.getClass(), "firstDataVersion", "eeXAgrClVJ");
        setField(term237424, term237424.getClass(), "firstPlayDate", "tRRSLRxoVF");
        setField(term237424, term237424.getClass(), "compatibleCmVersion", "rogVlsxmoq");
        setField(term237424, term237424.getClass(), "dailyBonusDate", "PcMQxtTThd");
        setField(term237424, term237424.getClass(), "dailyCourseBonusDate", "tlNezuIPME");
        setField(term237424, term237424.getClass(), "lastPairLoginDate", "tEciBFrLbF");
        setField(term237424, term237424.getClass(), "lastTrialPlayDate", "HABvqoZbct");
        setIntField(term237424, term237424.getClass(), "playVsCount", 1564010051);
        setIntField(term237424, term237424.getClass(), "playSyncCount", -393490765);
        setIntField(term237424, term237424.getClass(), "winCount", 1719645392);
        setIntField(term237424, term237424.getClass(), "helpCount", -1568726677);
        setIntField(term237424, term237424.getClass(), "comboCount", -50171390);
        setLongField(term237424, term237424.getClass(), "totalDeluxscore", 8220672039035442792L);
        setLongField(term237424, term237424.getClass(), "totalBasicDeluxscore", 4242529719663426169L);
        setLongField(term237424, term237424.getClass(), "totalAdvancedDeluxscore", 4213121090342564005L);
        setLongField(term237424, term237424.getClass(), "totalExpertDeluxscore", -2948091901886190540L);
        setLongField(term237424, term237424.getClass(), "totalMasterDeluxscore", -6519233171935989071L);
        setLongField(term237424, term237424.getClass(), "totalReMasterDeluxscore", 988913454026696345L);
        setIntField(term237424, term237424.getClass(), "totalSync", -1864856304);
        setIntField(term237424, term237424.getClass(), "totalBasicSync", -350728812);
        setIntField(term237424, term237424.getClass(), "totalAdvancedSync", 809905435);
        setIntField(term237424, term237424.getClass(), "totalExpertSync", 574151348);
        setIntField(term237424, term237424.getClass(), "totalMasterSync", 70907345);
        setIntField(term237424, term237424.getClass(), "totalReMasterSync", 545684828);
        setLongField(term237424, term237424.getClass(), "totalAchievement", -2423521287019644102L);
        setLongField(term237424, term237424.getClass(), "totalBasicAchievement", 8183126810539423659L);
        setLongField(term237424, term237424.getClass(), "totalAdvancedAchievement", 1104317989481637128L);
        setLongField(term237424, term237424.getClass(), "totalExpertAchievement", 5917840784382149716L);
        setLongField(term237424, term237424.getClass(), "totalMasterAchievement", 259743151101428394L);
        setLongField(term237424, term237424.getClass(), "totalReMasterAchievement", 5254231665252296364L);
        setLongField(term237424, term237424.getClass(), "playerOldRating", 6619524225344417873L);
        setLongField(term237424, term237424.getClass(), "playerNewRating", 7801538642613841018L);
        setIntField(term237424, term237424.getClass(), "banState", 1278943912);
        setLongField(term237424, term237424.getClass(), "dateTime", 3452523108723515387L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerNewRating", argTypes, term237424, args);
    }

};


