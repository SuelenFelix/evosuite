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

public class UserDetail_setTotalReMasterDeluxscore_2137334951137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4307754;
     Object term4308105;

    public UserDetail_setTotalReMasterDeluxscore_2137334951137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4307758 = new Long(8066087404848503575L);
        Integer term4307821 = new Integer(1676382020);
        Integer term4307823 = new Integer(-368458204);
        Integer term4307825 = new Integer(385413138);
        Integer term4307827 = new Integer(546200121);
        ArrayList term4307819 = new ArrayList();
        ((ArrayList) term4307819).add(term4307821);
        ((ArrayList) term4307819).add(term4307823);
        ((ArrayList) term4307819).add(term4307825);
        ((ArrayList) term4307819).add(term4307827);
        Integer term4307833 = new Integer(-100422031);
        Integer term4307835 = new Integer(-906004322);
        ArrayList term4307831 = new ArrayList();
        ((ArrayList) term4307831).add(term4307833);
        ((ArrayList) term4307831).add(term4307835);
        term4307754 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4307756 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4307772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4307773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4307777 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4307782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4307783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4307787 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4307754, term4307754.getClass(), "id", -4284151903682219139L);
        setLongField(term4307756, term4307756.getClass(), "id", -7277944816987771795L);
        setField(term4307756, term4307756.getClass(), "extId", term4307758);
        setField(term4307756, term4307756.getClass(), "luid", "qNqBNkxJZR");
        setIntField(term4307773, term4307773.getClass(), "year", 2011);
        setShortField(term4307773, term4307773.getClass(), "month", (short) 4);
        setShortField(term4307773, term4307773.getClass(), "day", (short) 3);
        setField(term4307772, term4307772.getClass(), "date", term4307773);
        setByteField(term4307777, term4307777.getClass(), "hour", (byte) 22);
        setByteField(term4307777, term4307777.getClass(), "minute", (byte) 35);
        setByteField(term4307777, term4307777.getClass(), "second", (byte) 6);
        setIntField(term4307777, term4307777.getClass(), "nano", 427117081);
        setField(term4307772, term4307772.getClass(), "time", term4307777);
        setField(term4307756, term4307756.getClass(), "registerTime", term4307772);
        setIntField(term4307783, term4307783.getClass(), "year", 2014);
        setShortField(term4307783, term4307783.getClass(), "month", (short) 6);
        setShortField(term4307783, term4307783.getClass(), "day", (short) 8);
        setField(term4307782, term4307782.getClass(), "date", term4307783);
        setByteField(term4307787, term4307787.getClass(), "hour", (byte) 5);
        setByteField(term4307787, term4307787.getClass(), "minute", (byte) 20);
        setByteField(term4307787, term4307787.getClass(), "second", (byte) 59);
        setIntField(term4307787, term4307787.getClass(), "nano", 656156);
        setField(term4307782, term4307782.getClass(), "time", term4307787);
        setField(term4307756, term4307756.getClass(), "accessTime", term4307782);
        setField(term4307754, term4307754.getClass(), "card", term4307756);
        setField(term4307754, term4307754.getClass(), "userName", "kYnYLGwOqi");
        setIntField(term4307754, term4307754.getClass(), "isNetMember", -115895932);
        setIntField(term4307754, term4307754.getClass(), "iconId", 1853875537);
        setIntField(term4307754, term4307754.getClass(), "plateId", 123571578);
        setIntField(term4307754, term4307754.getClass(), "titleId", 2020241154);
        setIntField(term4307754, term4307754.getClass(), "partnerId", -2060745478);
        setIntField(term4307754, term4307754.getClass(), "frameId", -2121173124);
        setIntField(term4307754, term4307754.getClass(), "selectMapId", -1602246225);
        setIntField(term4307754, term4307754.getClass(), "totalAwake", -1339054026);
        setIntField(term4307754, term4307754.getClass(), "gradeRating", -1294386507);
        setIntField(term4307754, term4307754.getClass(), "musicRating", 1183028572);
        setIntField(term4307754, term4307754.getClass(), "playerRating", -1056972438);
        setIntField(term4307754, term4307754.getClass(), "highestRating", -1298160231);
        setIntField(term4307754, term4307754.getClass(), "gradeRank", -2041254284);
        setIntField(term4307754, term4307754.getClass(), "classRank", -1908797839);
        setIntField(term4307754, term4307754.getClass(), "courseRank", 1985191554);
        setField(term4307754, term4307754.getClass(), "charaSlot", term4307819);
        setField(term4307754, term4307754.getClass(), "charaLockSlot", term4307831);
        setLongField(term4307754, term4307754.getClass(), "contentBit", -4907555659688051998L);
        setIntField(term4307754, term4307754.getClass(), "playCount", -1179456998);
        setField(term4307754, term4307754.getClass(), "eventWatchedDate", "ZXEQEUDuGN");
        setField(term4307754, term4307754.getClass(), "lastGameId", "fIPNdXSuSz");
        setField(term4307754, term4307754.getClass(), "lastRomVersion", "iZVtvXxcva");
        setField(term4307754, term4307754.getClass(), "lastDataVersion", "cEgceVCkWe");
        setField(term4307754, term4307754.getClass(), "lastLoginDate", "lEAKdqnFDf");
        setField(term4307754, term4307754.getClass(), "lastPlayDate", "lvyqumbiWW");
        setIntField(term4307754, term4307754.getClass(), "lastPlayCredit", 1485368730);
        setIntField(term4307754, term4307754.getClass(), "lastPlayMode", 1588165101);
        setIntField(term4307754, term4307754.getClass(), "lastPlaceId", -519696153);
        setField(term4307754, term4307754.getClass(), "lastPlaceName", "BtkSoswyFE");
        setIntField(term4307754, term4307754.getClass(), "lastAllNetId", 1953038569);
        setIntField(term4307754, term4307754.getClass(), "lastRegionId", 981647977);
        setField(term4307754, term4307754.getClass(), "lastRegionName", "jgzzKdxMZk");
        setField(term4307754, term4307754.getClass(), "lastClientId", "YRLvdbUqAD");
        setField(term4307754, term4307754.getClass(), "lastCountryCode", "uErrxwzNKh");
        setIntField(term4307754, term4307754.getClass(), "lastSelectEMoney", 1226003423);
        setIntField(term4307754, term4307754.getClass(), "lastSelectTicket", 61796086);
        setIntField(term4307754, term4307754.getClass(), "lastSelectCourse", -65808067);
        setIntField(term4307754, term4307754.getClass(), "lastCountCourse", -1414832529);
        setField(term4307754, term4307754.getClass(), "firstGameId", "ktfjULybGr");
        setField(term4307754, term4307754.getClass(), "firstRomVersion", "nnRZXeNZXR");
        setField(term4307754, term4307754.getClass(), "firstDataVersion", "CHeaFdUUTh");
        setField(term4307754, term4307754.getClass(), "firstPlayDate", "MtjyOscAKu");
        setField(term4307754, term4307754.getClass(), "compatibleCmVersion", "ZMYUmCFDgu");
        setField(term4307754, term4307754.getClass(), "dailyBonusDate", "mUZuZMidlf");
        setField(term4307754, term4307754.getClass(), "dailyCourseBonusDate", "hBDuXHDaDZ");
        setField(term4307754, term4307754.getClass(), "lastPairLoginDate", "UoxGBPPiVc");
        setField(term4307754, term4307754.getClass(), "lastTrialPlayDate", "OEOPkDSuOh");
        setIntField(term4307754, term4307754.getClass(), "playVsCount", 822364308);
        setIntField(term4307754, term4307754.getClass(), "playSyncCount", 757360399);
        setIntField(term4307754, term4307754.getClass(), "winCount", -149513647);
        setIntField(term4307754, term4307754.getClass(), "helpCount", -1020069825);
        setIntField(term4307754, term4307754.getClass(), "comboCount", 1382109754);
        setLongField(term4307754, term4307754.getClass(), "totalDeluxscore", -4138484900318402049L);
        setLongField(term4307754, term4307754.getClass(), "totalBasicDeluxscore", -3136666070498798253L);
        setLongField(term4307754, term4307754.getClass(), "totalAdvancedDeluxscore", -3552531097431440778L);
        setLongField(term4307754, term4307754.getClass(), "totalExpertDeluxscore", -8904535192058694501L);
        setLongField(term4307754, term4307754.getClass(), "totalMasterDeluxscore", 1443026389117082278L);
        setLongField(term4307754, term4307754.getClass(), "totalReMasterDeluxscore", -3442041795946050365L);
        setIntField(term4307754, term4307754.getClass(), "totalSync", -538831261);
        setIntField(term4307754, term4307754.getClass(), "totalBasicSync", 82785198);
        setIntField(term4307754, term4307754.getClass(), "totalAdvancedSync", -1099919260);
        setIntField(term4307754, term4307754.getClass(), "totalExpertSync", -629764923);
        setIntField(term4307754, term4307754.getClass(), "totalMasterSync", 1575491858);
        setIntField(term4307754, term4307754.getClass(), "totalReMasterSync", -552456784);
        setLongField(term4307754, term4307754.getClass(), "totalAchievement", 3751786244545993883L);
        setLongField(term4307754, term4307754.getClass(), "totalBasicAchievement", 1646170262380991379L);
        setLongField(term4307754, term4307754.getClass(), "totalAdvancedAchievement", -8197972621241488196L);
        setLongField(term4307754, term4307754.getClass(), "totalExpertAchievement", 8491697614926066777L);
        setLongField(term4307754, term4307754.getClass(), "totalMasterAchievement", 374442533778640172L);
        setLongField(term4307754, term4307754.getClass(), "totalReMasterAchievement", 6436432354874850280L);
        setLongField(term4307754, term4307754.getClass(), "playerOldRating", 8271230703111328627L);
        setLongField(term4307754, term4307754.getClass(), "playerNewRating", 8209255317435056355L);
        setIntField(term4307754, term4307754.getClass(), "banState", 763384210);
        setLongField(term4307754, term4307754.getClass(), "dateTime", -5094276961095560099L);
        term4308105 = new Long(-6894464199661777861L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4308105;
        callMethod(klass, "setTotalReMasterDeluxscore", argTypes, term4307754, args);
    }

};


