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

public class UserDetail_getTotalExpertSync_73332090165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231831;

    public UserDetail_getTotalExpertSync_73332090165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term231835 = new Long(7010148136855890340L);
        Integer term231898 = new Integer(-101515724);
        Integer term231900 = new Integer(987526407);
        ArrayList term231896 = new ArrayList();
        ((ArrayList) term231896).add(term231898);
        ((ArrayList) term231896).add(term231900);
        Integer term231906 = new Integer(-1370999464);
        Integer term231908 = new Integer(-409231949);
        ArrayList term231904 = new ArrayList();
        ((ArrayList) term231904).add(term231906);
        ((ArrayList) term231904).add(term231908);
        term231831 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term231833 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term231849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term231859 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231864 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term231831, term231831.getClass(), "id", -2138139617859519044L);
        setLongField(term231833, term231833.getClass(), "id", -945634812351574587L);
        setField(term231833, term231833.getClass(), "extId", term231835);
        setField(term231833, term231833.getClass(), "luid", "VeVoOlkaSZ");
        setIntField(term231850, term231850.getClass(), "year", 2024);
        setShortField(term231850, term231850.getClass(), "month", (short) 5);
        setShortField(term231850, term231850.getClass(), "day", (short) 28);
        setField(term231849, term231849.getClass(), "date", term231850);
        setByteField(term231854, term231854.getClass(), "hour", (byte) 15);
        setByteField(term231854, term231854.getClass(), "minute", (byte) 17);
        setByteField(term231854, term231854.getClass(), "second", (byte) 52);
        setIntField(term231854, term231854.getClass(), "nano", 650019774);
        setField(term231849, term231849.getClass(), "time", term231854);
        setField(term231833, term231833.getClass(), "registerTime", term231849);
        setIntField(term231860, term231860.getClass(), "year", 2028);
        setShortField(term231860, term231860.getClass(), "month", (short) 12);
        setShortField(term231860, term231860.getClass(), "day", (short) 5);
        setField(term231859, term231859.getClass(), "date", term231860);
        setByteField(term231864, term231864.getClass(), "hour", (byte) 0);
        setByteField(term231864, term231864.getClass(), "minute", (byte) 31);
        setByteField(term231864, term231864.getClass(), "second", (byte) 47);
        setIntField(term231864, term231864.getClass(), "nano", 889672113);
        setField(term231859, term231859.getClass(), "time", term231864);
        setField(term231833, term231833.getClass(), "accessTime", term231859);
        setField(term231831, term231831.getClass(), "card", term231833);
        setField(term231831, term231831.getClass(), "userName", "wdxwtYvPiv");
        setIntField(term231831, term231831.getClass(), "isNetMember", -2034531066);
        setIntField(term231831, term231831.getClass(), "iconId", -198669254);
        setIntField(term231831, term231831.getClass(), "plateId", -1240490694);
        setIntField(term231831, term231831.getClass(), "titleId", 244720262);
        setIntField(term231831, term231831.getClass(), "partnerId", 370854194);
        setIntField(term231831, term231831.getClass(), "frameId", -17070269);
        setIntField(term231831, term231831.getClass(), "selectMapId", 1467833271);
        setIntField(term231831, term231831.getClass(), "totalAwake", 1376444883);
        setIntField(term231831, term231831.getClass(), "gradeRating", 48103208);
        setIntField(term231831, term231831.getClass(), "musicRating", -655467488);
        setIntField(term231831, term231831.getClass(), "playerRating", 283820186);
        setIntField(term231831, term231831.getClass(), "highestRating", 1640365049);
        setIntField(term231831, term231831.getClass(), "gradeRank", 1288816449);
        setIntField(term231831, term231831.getClass(), "classRank", 1261399430);
        setIntField(term231831, term231831.getClass(), "courseRank", 1575653315);
        setField(term231831, term231831.getClass(), "charaSlot", term231896);
        setField(term231831, term231831.getClass(), "charaLockSlot", term231904);
        setLongField(term231831, term231831.getClass(), "contentBit", 4804264407297537936L);
        setIntField(term231831, term231831.getClass(), "playCount", 2116845908);
        setField(term231831, term231831.getClass(), "eventWatchedDate", "xUmjORhtNm");
        setField(term231831, term231831.getClass(), "lastGameId", "aAllLDsbll");
        setField(term231831, term231831.getClass(), "lastRomVersion", "tATJNkymBw");
        setField(term231831, term231831.getClass(), "lastDataVersion", "bkSURJdLBL");
        setField(term231831, term231831.getClass(), "lastLoginDate", "aNcXIRUToO");
        setField(term231831, term231831.getClass(), "lastPlayDate", "nBABxWLGOf");
        setIntField(term231831, term231831.getClass(), "lastPlayCredit", 936161131);
        setIntField(term231831, term231831.getClass(), "lastPlayMode", -691701814);
        setIntField(term231831, term231831.getClass(), "lastPlaceId", 1510066525);
        setField(term231831, term231831.getClass(), "lastPlaceName", "jdlTBcTsNZ");
        setIntField(term231831, term231831.getClass(), "lastAllNetId", 1469611278);
        setIntField(term231831, term231831.getClass(), "lastRegionId", -1162670035);
        setField(term231831, term231831.getClass(), "lastRegionName", "fZOYubmjQr");
        setField(term231831, term231831.getClass(), "lastClientId", "NgDePNgOTA");
        setField(term231831, term231831.getClass(), "lastCountryCode", "vSBdHCYUVt");
        setIntField(term231831, term231831.getClass(), "lastSelectEMoney", -1451867244);
        setIntField(term231831, term231831.getClass(), "lastSelectTicket", 559904906);
        setIntField(term231831, term231831.getClass(), "lastSelectCourse", 393431288);
        setIntField(term231831, term231831.getClass(), "lastCountCourse", 644691432);
        setField(term231831, term231831.getClass(), "firstGameId", "THvGTpdqrf");
        setField(term231831, term231831.getClass(), "firstRomVersion", "ucbQApFAaL");
        setField(term231831, term231831.getClass(), "firstDataVersion", "ZxAIlRffKc");
        setField(term231831, term231831.getClass(), "firstPlayDate", "WazDBkwTAD");
        setField(term231831, term231831.getClass(), "compatibleCmVersion", "OMMiKBeIDF");
        setField(term231831, term231831.getClass(), "dailyBonusDate", "VVatnPtgTf");
        setField(term231831, term231831.getClass(), "dailyCourseBonusDate", "UQKKIKJhBm");
        setField(term231831, term231831.getClass(), "lastPairLoginDate", "fXkuwVyxxe");
        setField(term231831, term231831.getClass(), "lastTrialPlayDate", "xALGJngydr");
        setIntField(term231831, term231831.getClass(), "playVsCount", -531017774);
        setIntField(term231831, term231831.getClass(), "playSyncCount", 854607935);
        setIntField(term231831, term231831.getClass(), "winCount", -1266627939);
        setIntField(term231831, term231831.getClass(), "helpCount", 1228954206);
        setIntField(term231831, term231831.getClass(), "comboCount", 43427568);
        setLongField(term231831, term231831.getClass(), "totalDeluxscore", -3802999224635376611L);
        setLongField(term231831, term231831.getClass(), "totalBasicDeluxscore", -1638779219901812994L);
        setLongField(term231831, term231831.getClass(), "totalAdvancedDeluxscore", 2815686903333436830L);
        setLongField(term231831, term231831.getClass(), "totalExpertDeluxscore", -4726990010795804697L);
        setLongField(term231831, term231831.getClass(), "totalMasterDeluxscore", 18115689564627037L);
        setLongField(term231831, term231831.getClass(), "totalReMasterDeluxscore", -6649862739070461398L);
        setIntField(term231831, term231831.getClass(), "totalSync", -887356821);
        setIntField(term231831, term231831.getClass(), "totalBasicSync", 1123610004);
        setIntField(term231831, term231831.getClass(), "totalAdvancedSync", 184496760);
        setIntField(term231831, term231831.getClass(), "totalExpertSync", -903785659);
        setIntField(term231831, term231831.getClass(), "totalMasterSync", -759603874);
        setIntField(term231831, term231831.getClass(), "totalReMasterSync", -854724842);
        setLongField(term231831, term231831.getClass(), "totalAchievement", 5437696365924758973L);
        setLongField(term231831, term231831.getClass(), "totalBasicAchievement", 3839192148499886301L);
        setLongField(term231831, term231831.getClass(), "totalAdvancedAchievement", -7160579949074592420L);
        setLongField(term231831, term231831.getClass(), "totalExpertAchievement", -3750069780213532199L);
        setLongField(term231831, term231831.getClass(), "totalMasterAchievement", -8477618123087365585L);
        setLongField(term231831, term231831.getClass(), "totalReMasterAchievement", -1293962831337793157L);
        setLongField(term231831, term231831.getClass(), "playerOldRating", -8600281105080826389L);
        setLongField(term231831, term231831.getClass(), "playerNewRating", -5600163086356818263L);
        setIntField(term231831, term231831.getClass(), "banState", 1250890819);
        setLongField(term231831, term231831.getClass(), "dateTime", 7050041705355474598L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertSync", argTypes, term231831, args);
    }

};


