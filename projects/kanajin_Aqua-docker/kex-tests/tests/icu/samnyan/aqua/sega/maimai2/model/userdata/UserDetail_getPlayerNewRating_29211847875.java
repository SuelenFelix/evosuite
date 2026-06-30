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

public class UserDetail_getPlayerNewRating_29211847875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237479;

    public UserDetail_getPlayerNewRating_29211847875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term237483 = new Long(-3231440836116263235L);
        ArrayList term237544 = new ArrayList();
        Integer term237550 = new Integer(-1307655183);
        Integer term237552 = new Integer(1309934432);
        ArrayList term237548 = new ArrayList();
        ((ArrayList) term237548).add(term237550);
        ((ArrayList) term237548).add(term237552);
        term237479 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term237481 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term237497 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term237498 = newInstance(Class.forName("java.time.LocalDate"));
        Object term237502 = newInstance(Class.forName("java.time.LocalTime"));
        Object term237507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term237508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term237512 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term237479, term237479.getClass(), "id", 2919393911207262117L);
        setLongField(term237481, term237481.getClass(), "id", 4656718360537135113L);
        setField(term237481, term237481.getClass(), "extId", term237483);
        setField(term237481, term237481.getClass(), "luid", "udgIsSKFRr");
        setIntField(term237498, term237498.getClass(), "year", 2019);
        setShortField(term237498, term237498.getClass(), "month", (short) 10);
        setShortField(term237498, term237498.getClass(), "day", (short) 25);
        setField(term237497, term237497.getClass(), "date", term237498);
        setByteField(term237502, term237502.getClass(), "hour", (byte) 18);
        setByteField(term237502, term237502.getClass(), "minute", (byte) 58);
        setByteField(term237502, term237502.getClass(), "second", (byte) 55);
        setIntField(term237502, term237502.getClass(), "nano", 407840282);
        setField(term237497, term237497.getClass(), "time", term237502);
        setField(term237481, term237481.getClass(), "registerTime", term237497);
        setIntField(term237508, term237508.getClass(), "year", 2012);
        setShortField(term237508, term237508.getClass(), "month", (short) 4);
        setShortField(term237508, term237508.getClass(), "day", (short) 23);
        setField(term237507, term237507.getClass(), "date", term237508);
        setByteField(term237512, term237512.getClass(), "hour", (byte) 8);
        setByteField(term237512, term237512.getClass(), "minute", (byte) 11);
        setByteField(term237512, term237512.getClass(), "second", (byte) 45);
        setIntField(term237512, term237512.getClass(), "nano", 286907697);
        setField(term237507, term237507.getClass(), "time", term237512);
        setField(term237481, term237481.getClass(), "accessTime", term237507);
        setField(term237479, term237479.getClass(), "card", term237481);
        setField(term237479, term237479.getClass(), "userName", "aOLivtFpQk");
        setIntField(term237479, term237479.getClass(), "isNetMember", 365154265);
        setIntField(term237479, term237479.getClass(), "iconId", -199029048);
        setIntField(term237479, term237479.getClass(), "plateId", -1738730758);
        setIntField(term237479, term237479.getClass(), "titleId", 252807194);
        setIntField(term237479, term237479.getClass(), "partnerId", -1970748295);
        setIntField(term237479, term237479.getClass(), "frameId", -970919712);
        setIntField(term237479, term237479.getClass(), "selectMapId", 644708268);
        setIntField(term237479, term237479.getClass(), "totalAwake", -171593389);
        setIntField(term237479, term237479.getClass(), "gradeRating", 1617777059);
        setIntField(term237479, term237479.getClass(), "musicRating", 1582718344);
        setIntField(term237479, term237479.getClass(), "playerRating", 122167659);
        setIntField(term237479, term237479.getClass(), "highestRating", -1126970397);
        setIntField(term237479, term237479.getClass(), "gradeRank", 1728431100);
        setIntField(term237479, term237479.getClass(), "classRank", -869897258);
        setIntField(term237479, term237479.getClass(), "courseRank", 962362818);
        setField(term237479, term237479.getClass(), "charaSlot", term237544);
        setField(term237479, term237479.getClass(), "charaLockSlot", term237548);
        setLongField(term237479, term237479.getClass(), "contentBit", 1208024088168011848L);
        setIntField(term237479, term237479.getClass(), "playCount", -1177115437);
        setField(term237479, term237479.getClass(), "eventWatchedDate", "ZOLKnxBnCK");
        setField(term237479, term237479.getClass(), "lastGameId", "NfgTNwHaCV");
        setField(term237479, term237479.getClass(), "lastRomVersion", "XAejapRogI");
        setField(term237479, term237479.getClass(), "lastDataVersion", "tjtosnRhZg");
        setField(term237479, term237479.getClass(), "lastLoginDate", "fAebRNsXjr");
        setField(term237479, term237479.getClass(), "lastPlayDate", "EQODXZdfZL");
        setIntField(term237479, term237479.getClass(), "lastPlayCredit", -488175128);
        setIntField(term237479, term237479.getClass(), "lastPlayMode", -663945631);
        setIntField(term237479, term237479.getClass(), "lastPlaceId", 721797064);
        setField(term237479, term237479.getClass(), "lastPlaceName", "QScgqkQatE");
        setIntField(term237479, term237479.getClass(), "lastAllNetId", 1046449580);
        setIntField(term237479, term237479.getClass(), "lastRegionId", 371812655);
        setField(term237479, term237479.getClass(), "lastRegionName", "vLgGnXxXre");
        setField(term237479, term237479.getClass(), "lastClientId", "AccEBvkfGm");
        setField(term237479, term237479.getClass(), "lastCountryCode", "RXhiAWuHdv");
        setIntField(term237479, term237479.getClass(), "lastSelectEMoney", 1065841171);
        setIntField(term237479, term237479.getClass(), "lastSelectTicket", 1086310493);
        setIntField(term237479, term237479.getClass(), "lastSelectCourse", 1541036402);
        setIntField(term237479, term237479.getClass(), "lastCountCourse", 1185835742);
        setField(term237479, term237479.getClass(), "firstGameId", "ERohGnSYkC");
        setField(term237479, term237479.getClass(), "firstRomVersion", "yMgWhzgQld");
        setField(term237479, term237479.getClass(), "firstDataVersion", "eeXAgrClVJ");
        setField(term237479, term237479.getClass(), "firstPlayDate", "tRRSLRxoVF");
        setField(term237479, term237479.getClass(), "compatibleCmVersion", "rogVlsxmoq");
        setField(term237479, term237479.getClass(), "dailyBonusDate", "PcMQxtTThd");
        setField(term237479, term237479.getClass(), "dailyCourseBonusDate", "tlNezuIPME");
        setField(term237479, term237479.getClass(), "lastPairLoginDate", "tEciBFrLbF");
        setField(term237479, term237479.getClass(), "lastTrialPlayDate", "HABvqoZbct");
        setIntField(term237479, term237479.getClass(), "playVsCount", 1564010051);
        setIntField(term237479, term237479.getClass(), "playSyncCount", -393490765);
        setIntField(term237479, term237479.getClass(), "winCount", 1719645392);
        setIntField(term237479, term237479.getClass(), "helpCount", -1568726677);
        setIntField(term237479, term237479.getClass(), "comboCount", -50171390);
        setLongField(term237479, term237479.getClass(), "totalDeluxscore", 8220672039035442792L);
        setLongField(term237479, term237479.getClass(), "totalBasicDeluxscore", 4242529719663426169L);
        setLongField(term237479, term237479.getClass(), "totalAdvancedDeluxscore", 4213121090342564005L);
        setLongField(term237479, term237479.getClass(), "totalExpertDeluxscore", -2948091901886190540L);
        setLongField(term237479, term237479.getClass(), "totalMasterDeluxscore", -6519233171935989071L);
        setLongField(term237479, term237479.getClass(), "totalReMasterDeluxscore", 988913454026696345L);
        setIntField(term237479, term237479.getClass(), "totalSync", -1864856304);
        setIntField(term237479, term237479.getClass(), "totalBasicSync", -350728812);
        setIntField(term237479, term237479.getClass(), "totalAdvancedSync", 809905435);
        setIntField(term237479, term237479.getClass(), "totalExpertSync", 574151348);
        setIntField(term237479, term237479.getClass(), "totalMasterSync", 70907345);
        setIntField(term237479, term237479.getClass(), "totalReMasterSync", 545684828);
        setLongField(term237479, term237479.getClass(), "totalAchievement", -2423521287019644102L);
        setLongField(term237479, term237479.getClass(), "totalBasicAchievement", 8183126810539423659L);
        setLongField(term237479, term237479.getClass(), "totalAdvancedAchievement", 1104317989481637128L);
        setLongField(term237479, term237479.getClass(), "totalExpertAchievement", 5917840784382149716L);
        setLongField(term237479, term237479.getClass(), "totalMasterAchievement", 259743151101428394L);
        setLongField(term237479, term237479.getClass(), "totalReMasterAchievement", 5254231665252296364L);
        setLongField(term237479, term237479.getClass(), "playerOldRating", 6619524225344417873L);
        setLongField(term237479, term237479.getClass(), "playerNewRating", 7801538642613841018L);
        setIntField(term237479, term237479.getClass(), "banState", 1278943912);
        setLongField(term237479, term237479.getClass(), "dateTime", 3452523108723515387L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerNewRating", argTypes, term237479, args);
    }

};


