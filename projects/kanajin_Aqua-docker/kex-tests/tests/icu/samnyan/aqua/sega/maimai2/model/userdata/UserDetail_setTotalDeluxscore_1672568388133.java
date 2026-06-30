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

public class UserDetail_setTotalDeluxscore_1672568388133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270853;
     Object term271192;

    public UserDetail_setTotalDeluxscore_1672568388133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term270857 = new Long(7464122056779140588L);
        ArrayList term270918 = new ArrayList();
        ArrayList term270922 = new ArrayList();
        term270853 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term270855 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term270871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term270881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270886 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term270853, term270853.getClass(), "id", 2967181070475060579L);
        setLongField(term270855, term270855.getClass(), "id", 7711678716547148571L);
        setField(term270855, term270855.getClass(), "extId", term270857);
        setField(term270855, term270855.getClass(), "luid", "ZdzOASPfVr");
        setIntField(term270872, term270872.getClass(), "year", 2010);
        setShortField(term270872, term270872.getClass(), "month", (short) 9);
        setShortField(term270872, term270872.getClass(), "day", (short) 29);
        setField(term270871, term270871.getClass(), "date", term270872);
        setByteField(term270876, term270876.getClass(), "hour", (byte) 8);
        setByteField(term270876, term270876.getClass(), "minute", (byte) 31);
        setByteField(term270876, term270876.getClass(), "second", (byte) 30);
        setIntField(term270876, term270876.getClass(), "nano", 849859593);
        setField(term270871, term270871.getClass(), "time", term270876);
        setField(term270855, term270855.getClass(), "registerTime", term270871);
        setIntField(term270882, term270882.getClass(), "year", 2012);
        setShortField(term270882, term270882.getClass(), "month", (short) 8);
        setShortField(term270882, term270882.getClass(), "day", (short) 20);
        setField(term270881, term270881.getClass(), "date", term270882);
        setByteField(term270886, term270886.getClass(), "hour", (byte) 3);
        setByteField(term270886, term270886.getClass(), "minute", (byte) 28);
        setByteField(term270886, term270886.getClass(), "second", (byte) 41);
        setIntField(term270886, term270886.getClass(), "nano", 318104116);
        setField(term270881, term270881.getClass(), "time", term270886);
        setField(term270855, term270855.getClass(), "accessTime", term270881);
        setField(term270853, term270853.getClass(), "card", term270855);
        setField(term270853, term270853.getClass(), "userName", "uYcMmnQOMD");
        setIntField(term270853, term270853.getClass(), "isNetMember", -1337932659);
        setIntField(term270853, term270853.getClass(), "iconId", -1851616394);
        setIntField(term270853, term270853.getClass(), "plateId", 1530110795);
        setIntField(term270853, term270853.getClass(), "titleId", -1883428800);
        setIntField(term270853, term270853.getClass(), "partnerId", 1157616668);
        setIntField(term270853, term270853.getClass(), "frameId", -90435964);
        setIntField(term270853, term270853.getClass(), "selectMapId", -148280744);
        setIntField(term270853, term270853.getClass(), "totalAwake", -719081831);
        setIntField(term270853, term270853.getClass(), "gradeRating", 541867805);
        setIntField(term270853, term270853.getClass(), "musicRating", 1140585505);
        setIntField(term270853, term270853.getClass(), "playerRating", -625247027);
        setIntField(term270853, term270853.getClass(), "highestRating", 2119038637);
        setIntField(term270853, term270853.getClass(), "gradeRank", 929089598);
        setIntField(term270853, term270853.getClass(), "classRank", -764359478);
        setIntField(term270853, term270853.getClass(), "courseRank", -650378880);
        setField(term270853, term270853.getClass(), "charaSlot", term270918);
        setField(term270853, term270853.getClass(), "charaLockSlot", term270922);
        setLongField(term270853, term270853.getClass(), "contentBit", -3008489780092530387L);
        setIntField(term270853, term270853.getClass(), "playCount", 1983275307);
        setField(term270853, term270853.getClass(), "eventWatchedDate", "qqlqorfOrc");
        setField(term270853, term270853.getClass(), "lastGameId", "mwapivGBrr");
        setField(term270853, term270853.getClass(), "lastRomVersion", "noUqCHRNIJ");
        setField(term270853, term270853.getClass(), "lastDataVersion", "gUxWMTfcxo");
        setField(term270853, term270853.getClass(), "lastLoginDate", "JJbWybZFwv");
        setField(term270853, term270853.getClass(), "lastPlayDate", "OFVygCZPpR");
        setIntField(term270853, term270853.getClass(), "lastPlayCredit", 369962091);
        setIntField(term270853, term270853.getClass(), "lastPlayMode", -305227009);
        setIntField(term270853, term270853.getClass(), "lastPlaceId", -147443379);
        setField(term270853, term270853.getClass(), "lastPlaceName", "ERTUvcHbLH");
        setIntField(term270853, term270853.getClass(), "lastAllNetId", -361601596);
        setIntField(term270853, term270853.getClass(), "lastRegionId", 1129701491);
        setField(term270853, term270853.getClass(), "lastRegionName", "jKiphxsuJM");
        setField(term270853, term270853.getClass(), "lastClientId", "uujNxYFnZF");
        setField(term270853, term270853.getClass(), "lastCountryCode", "MXcfAuvVvj");
        setIntField(term270853, term270853.getClass(), "lastSelectEMoney", 681832977);
        setIntField(term270853, term270853.getClass(), "lastSelectTicket", 1524336479);
        setIntField(term270853, term270853.getClass(), "lastSelectCourse", 968701988);
        setIntField(term270853, term270853.getClass(), "lastCountCourse", 195003627);
        setField(term270853, term270853.getClass(), "firstGameId", "IlgJTdCcvV");
        setField(term270853, term270853.getClass(), "firstRomVersion", "IEcNveAzGf");
        setField(term270853, term270853.getClass(), "firstDataVersion", "rAOwMnTIRo");
        setField(term270853, term270853.getClass(), "firstPlayDate", "wiCOTHLgkY");
        setField(term270853, term270853.getClass(), "compatibleCmVersion", "xXIZkppQGj");
        setField(term270853, term270853.getClass(), "dailyBonusDate", "htqYpwgttl");
        setField(term270853, term270853.getClass(), "dailyCourseBonusDate", "mtxJReaVzv");
        setField(term270853, term270853.getClass(), "lastPairLoginDate", "zsUxsLbtqp");
        setField(term270853, term270853.getClass(), "lastTrialPlayDate", "Dflpnxyaws");
        setIntField(term270853, term270853.getClass(), "playVsCount", 218703424);
        setIntField(term270853, term270853.getClass(), "playSyncCount", -1344458322);
        setIntField(term270853, term270853.getClass(), "winCount", 72566816);
        setIntField(term270853, term270853.getClass(), "helpCount", -188533678);
        setIntField(term270853, term270853.getClass(), "comboCount", 145353220);
        setLongField(term270853, term270853.getClass(), "totalDeluxscore", 206648767409784070L);
        setLongField(term270853, term270853.getClass(), "totalBasicDeluxscore", -853277949891207878L);
        setLongField(term270853, term270853.getClass(), "totalAdvancedDeluxscore", 1051065522329405746L);
        setLongField(term270853, term270853.getClass(), "totalExpertDeluxscore", -73316245621089353L);
        setLongField(term270853, term270853.getClass(), "totalMasterDeluxscore", 5911785757279649576L);
        setLongField(term270853, term270853.getClass(), "totalReMasterDeluxscore", -2815211424267452262L);
        setIntField(term270853, term270853.getClass(), "totalSync", 743278024);
        setIntField(term270853, term270853.getClass(), "totalBasicSync", 1804144939);
        setIntField(term270853, term270853.getClass(), "totalAdvancedSync", 647434101);
        setIntField(term270853, term270853.getClass(), "totalExpertSync", -1053102933);
        setIntField(term270853, term270853.getClass(), "totalMasterSync", -1147306541);
        setIntField(term270853, term270853.getClass(), "totalReMasterSync", -709169906);
        setLongField(term270853, term270853.getClass(), "totalAchievement", 7045314240245253953L);
        setLongField(term270853, term270853.getClass(), "totalBasicAchievement", 5417669300618694595L);
        setLongField(term270853, term270853.getClass(), "totalAdvancedAchievement", 9091783946467585899L);
        setLongField(term270853, term270853.getClass(), "totalExpertAchievement", -2970836668203808419L);
        setLongField(term270853, term270853.getClass(), "totalMasterAchievement", 6311932375680094253L);
        setLongField(term270853, term270853.getClass(), "totalReMasterAchievement", -6235722330553747318L);
        setLongField(term270853, term270853.getClass(), "playerOldRating", 1689774515827848680L);
        setLongField(term270853, term270853.getClass(), "playerNewRating", -2280703972070111169L);
        setIntField(term270853, term270853.getClass(), "banState", -1521964012);
        setLongField(term270853, term270853.getClass(), "dateTime", -5440125572975928738L);
        term271192 = new Long(186519983417459307L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term271192;
        callMethod(klass, "setTotalDeluxscore", argTypes, term270853, args);
    }

};


