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

public class UserDetail_setTotalDeluxscore_1672568388132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270798;
     Object term271137;

    public UserDetail_setTotalDeluxscore_1672568388132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term270802 = new Long(7464122056779140588L);
        ArrayList term270863 = new ArrayList();
        ArrayList term270867 = new ArrayList();
        term270798 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term270800 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term270816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270821 = newInstance(Class.forName("java.time.LocalTime"));
        Object term270826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270831 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term270798, term270798.getClass(), "id", 2967181070475060579L);
        setLongField(term270800, term270800.getClass(), "id", 7711678716547148571L);
        setField(term270800, term270800.getClass(), "extId", term270802);
        setField(term270800, term270800.getClass(), "luid", "ZdzOASPfVr");
        setIntField(term270817, term270817.getClass(), "year", 2010);
        setShortField(term270817, term270817.getClass(), "month", (short) 9);
        setShortField(term270817, term270817.getClass(), "day", (short) 29);
        setField(term270816, term270816.getClass(), "date", term270817);
        setByteField(term270821, term270821.getClass(), "hour", (byte) 8);
        setByteField(term270821, term270821.getClass(), "minute", (byte) 31);
        setByteField(term270821, term270821.getClass(), "second", (byte) 30);
        setIntField(term270821, term270821.getClass(), "nano", 849859593);
        setField(term270816, term270816.getClass(), "time", term270821);
        setField(term270800, term270800.getClass(), "registerTime", term270816);
        setIntField(term270827, term270827.getClass(), "year", 2012);
        setShortField(term270827, term270827.getClass(), "month", (short) 8);
        setShortField(term270827, term270827.getClass(), "day", (short) 20);
        setField(term270826, term270826.getClass(), "date", term270827);
        setByteField(term270831, term270831.getClass(), "hour", (byte) 3);
        setByteField(term270831, term270831.getClass(), "minute", (byte) 28);
        setByteField(term270831, term270831.getClass(), "second", (byte) 41);
        setIntField(term270831, term270831.getClass(), "nano", 318104116);
        setField(term270826, term270826.getClass(), "time", term270831);
        setField(term270800, term270800.getClass(), "accessTime", term270826);
        setField(term270798, term270798.getClass(), "card", term270800);
        setField(term270798, term270798.getClass(), "userName", "uYcMmnQOMD");
        setIntField(term270798, term270798.getClass(), "isNetMember", -1337932659);
        setIntField(term270798, term270798.getClass(), "iconId", -1851616394);
        setIntField(term270798, term270798.getClass(), "plateId", 1530110795);
        setIntField(term270798, term270798.getClass(), "titleId", -1883428800);
        setIntField(term270798, term270798.getClass(), "partnerId", 1157616668);
        setIntField(term270798, term270798.getClass(), "frameId", -90435964);
        setIntField(term270798, term270798.getClass(), "selectMapId", -148280744);
        setIntField(term270798, term270798.getClass(), "totalAwake", -719081831);
        setIntField(term270798, term270798.getClass(), "gradeRating", 541867805);
        setIntField(term270798, term270798.getClass(), "musicRating", 1140585505);
        setIntField(term270798, term270798.getClass(), "playerRating", -625247027);
        setIntField(term270798, term270798.getClass(), "highestRating", 2119038637);
        setIntField(term270798, term270798.getClass(), "gradeRank", 929089598);
        setIntField(term270798, term270798.getClass(), "classRank", -764359478);
        setIntField(term270798, term270798.getClass(), "courseRank", -650378880);
        setField(term270798, term270798.getClass(), "charaSlot", term270863);
        setField(term270798, term270798.getClass(), "charaLockSlot", term270867);
        setLongField(term270798, term270798.getClass(), "contentBit", -3008489780092530387L);
        setIntField(term270798, term270798.getClass(), "playCount", 1983275307);
        setField(term270798, term270798.getClass(), "eventWatchedDate", "qqlqorfOrc");
        setField(term270798, term270798.getClass(), "lastGameId", "mwapivGBrr");
        setField(term270798, term270798.getClass(), "lastRomVersion", "noUqCHRNIJ");
        setField(term270798, term270798.getClass(), "lastDataVersion", "gUxWMTfcxo");
        setField(term270798, term270798.getClass(), "lastLoginDate", "JJbWybZFwv");
        setField(term270798, term270798.getClass(), "lastPlayDate", "OFVygCZPpR");
        setIntField(term270798, term270798.getClass(), "lastPlayCredit", 369962091);
        setIntField(term270798, term270798.getClass(), "lastPlayMode", -305227009);
        setIntField(term270798, term270798.getClass(), "lastPlaceId", -147443379);
        setField(term270798, term270798.getClass(), "lastPlaceName", "ERTUvcHbLH");
        setIntField(term270798, term270798.getClass(), "lastAllNetId", -361601596);
        setIntField(term270798, term270798.getClass(), "lastRegionId", 1129701491);
        setField(term270798, term270798.getClass(), "lastRegionName", "jKiphxsuJM");
        setField(term270798, term270798.getClass(), "lastClientId", "uujNxYFnZF");
        setField(term270798, term270798.getClass(), "lastCountryCode", "MXcfAuvVvj");
        setIntField(term270798, term270798.getClass(), "lastSelectEMoney", 681832977);
        setIntField(term270798, term270798.getClass(), "lastSelectTicket", 1524336479);
        setIntField(term270798, term270798.getClass(), "lastSelectCourse", 968701988);
        setIntField(term270798, term270798.getClass(), "lastCountCourse", 195003627);
        setField(term270798, term270798.getClass(), "firstGameId", "IlgJTdCcvV");
        setField(term270798, term270798.getClass(), "firstRomVersion", "IEcNveAzGf");
        setField(term270798, term270798.getClass(), "firstDataVersion", "rAOwMnTIRo");
        setField(term270798, term270798.getClass(), "firstPlayDate", "wiCOTHLgkY");
        setField(term270798, term270798.getClass(), "compatibleCmVersion", "xXIZkppQGj");
        setField(term270798, term270798.getClass(), "dailyBonusDate", "htqYpwgttl");
        setField(term270798, term270798.getClass(), "dailyCourseBonusDate", "mtxJReaVzv");
        setField(term270798, term270798.getClass(), "lastPairLoginDate", "zsUxsLbtqp");
        setField(term270798, term270798.getClass(), "lastTrialPlayDate", "Dflpnxyaws");
        setIntField(term270798, term270798.getClass(), "playVsCount", 218703424);
        setIntField(term270798, term270798.getClass(), "playSyncCount", -1344458322);
        setIntField(term270798, term270798.getClass(), "winCount", 72566816);
        setIntField(term270798, term270798.getClass(), "helpCount", -188533678);
        setIntField(term270798, term270798.getClass(), "comboCount", 145353220);
        setLongField(term270798, term270798.getClass(), "totalDeluxscore", 206648767409784070L);
        setLongField(term270798, term270798.getClass(), "totalBasicDeluxscore", -853277949891207878L);
        setLongField(term270798, term270798.getClass(), "totalAdvancedDeluxscore", 1051065522329405746L);
        setLongField(term270798, term270798.getClass(), "totalExpertDeluxscore", -73316245621089353L);
        setLongField(term270798, term270798.getClass(), "totalMasterDeluxscore", 5911785757279649576L);
        setLongField(term270798, term270798.getClass(), "totalReMasterDeluxscore", -2815211424267452262L);
        setIntField(term270798, term270798.getClass(), "totalSync", 743278024);
        setIntField(term270798, term270798.getClass(), "totalBasicSync", 1804144939);
        setIntField(term270798, term270798.getClass(), "totalAdvancedSync", 647434101);
        setIntField(term270798, term270798.getClass(), "totalExpertSync", -1053102933);
        setIntField(term270798, term270798.getClass(), "totalMasterSync", -1147306541);
        setIntField(term270798, term270798.getClass(), "totalReMasterSync", -709169906);
        setLongField(term270798, term270798.getClass(), "totalAchievement", 7045314240245253953L);
        setLongField(term270798, term270798.getClass(), "totalBasicAchievement", 5417669300618694595L);
        setLongField(term270798, term270798.getClass(), "totalAdvancedAchievement", 9091783946467585899L);
        setLongField(term270798, term270798.getClass(), "totalExpertAchievement", -2970836668203808419L);
        setLongField(term270798, term270798.getClass(), "totalMasterAchievement", 6311932375680094253L);
        setLongField(term270798, term270798.getClass(), "totalReMasterAchievement", -6235722330553747318L);
        setLongField(term270798, term270798.getClass(), "playerOldRating", 1689774515827848680L);
        setLongField(term270798, term270798.getClass(), "playerNewRating", -2280703972070111169L);
        setIntField(term270798, term270798.getClass(), "banState", -1521964012);
        setLongField(term270798, term270798.getClass(), "dateTime", -5440125572975928738L);
        term271137 = new Long(186519983417459307L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term271137;
        callMethod(klass, "setTotalDeluxscore", argTypes, term270798, args);
    }

};


