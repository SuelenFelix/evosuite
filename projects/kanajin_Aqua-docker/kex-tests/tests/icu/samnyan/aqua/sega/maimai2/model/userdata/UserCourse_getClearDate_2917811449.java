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

public class UserCourse_getClearDate_2917811449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76747;

    public UserCourse_getClearDate_2917811449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76753 = new Long(-900457279156388404L);
        ArrayList term76814 = new ArrayList();
        Integer term76820 = new Integer(-861014847);
        Integer term76822 = new Integer(2132934139);
        ArrayList term76818 = new ArrayList();
        ((ArrayList) term76818).add(term76820);
        ((ArrayList) term76818).add(term76822);
        term76747 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term76749 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term76751 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76782 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76747, term76747.getClass(), "id", -1963200229998373954L);
        setLongField(term76749, term76749.getClass(), "id", 4805489732294700772L);
        setLongField(term76751, term76751.getClass(), "id", 619728764207590202L);
        setField(term76751, term76751.getClass(), "extId", term76753);
        setField(term76751, term76751.getClass(), "luid", "VuprBjhWdI");
        setIntField(term76768, term76768.getClass(), "year", 2025);
        setShortField(term76768, term76768.getClass(), "month", (short) 1);
        setShortField(term76768, term76768.getClass(), "day", (short) 20);
        setField(term76767, term76767.getClass(), "date", term76768);
        setByteField(term76772, term76772.getClass(), "hour", (byte) 22);
        setByteField(term76772, term76772.getClass(), "minute", (byte) 55);
        setByteField(term76772, term76772.getClass(), "second", (byte) 9);
        setIntField(term76772, term76772.getClass(), "nano", 660955568);
        setField(term76767, term76767.getClass(), "time", term76772);
        setField(term76751, term76751.getClass(), "registerTime", term76767);
        setIntField(term76778, term76778.getClass(), "year", 2014);
        setShortField(term76778, term76778.getClass(), "month", (short) 2);
        setShortField(term76778, term76778.getClass(), "day", (short) 26);
        setField(term76777, term76777.getClass(), "date", term76778);
        setByteField(term76782, term76782.getClass(), "hour", (byte) 16);
        setByteField(term76782, term76782.getClass(), "minute", (byte) 42);
        setByteField(term76782, term76782.getClass(), "second", (byte) 39);
        setIntField(term76782, term76782.getClass(), "nano", 690212071);
        setField(term76777, term76777.getClass(), "time", term76782);
        setField(term76751, term76751.getClass(), "accessTime", term76777);
        setField(term76749, term76749.getClass(), "card", term76751);
        setField(term76749, term76749.getClass(), "userName", "CFGOXMbAUn");
        setIntField(term76749, term76749.getClass(), "isNetMember", -1865794481);
        setIntField(term76749, term76749.getClass(), "iconId", -1811894511);
        setIntField(term76749, term76749.getClass(), "plateId", 162320449);
        setIntField(term76749, term76749.getClass(), "titleId", -299093975);
        setIntField(term76749, term76749.getClass(), "partnerId", 1297491984);
        setIntField(term76749, term76749.getClass(), "frameId", 2020056067);
        setIntField(term76749, term76749.getClass(), "selectMapId", -1958223804);
        setIntField(term76749, term76749.getClass(), "totalAwake", 1366353238);
        setIntField(term76749, term76749.getClass(), "gradeRating", 613588236);
        setIntField(term76749, term76749.getClass(), "musicRating", 31602333);
        setIntField(term76749, term76749.getClass(), "playerRating", -1136573689);
        setIntField(term76749, term76749.getClass(), "highestRating", -1236027195);
        setIntField(term76749, term76749.getClass(), "gradeRank", 133624666);
        setIntField(term76749, term76749.getClass(), "classRank", -1292573941);
        setIntField(term76749, term76749.getClass(), "courseRank", 1960867757);
        setField(term76749, term76749.getClass(), "charaSlot", term76814);
        setField(term76749, term76749.getClass(), "charaLockSlot", term76818);
        setLongField(term76749, term76749.getClass(), "contentBit", 7237161792345397933L);
        setIntField(term76749, term76749.getClass(), "playCount", -353830408);
        setField(term76749, term76749.getClass(), "eventWatchedDate", "OxlZVhvedR");
        setField(term76749, term76749.getClass(), "lastGameId", "eoDtSQyUsr");
        setField(term76749, term76749.getClass(), "lastRomVersion", "RMTgBohsAX");
        setField(term76749, term76749.getClass(), "lastDataVersion", "kdYeXJnJGG");
        setField(term76749, term76749.getClass(), "lastLoginDate", "XEdoshuvxD");
        setField(term76749, term76749.getClass(), "lastPlayDate", "ljtopXMcRl");
        setIntField(term76749, term76749.getClass(), "lastPlayCredit", 2082288063);
        setIntField(term76749, term76749.getClass(), "lastPlayMode", 535353751);
        setIntField(term76749, term76749.getClass(), "lastPlaceId", -63865927);
        setField(term76749, term76749.getClass(), "lastPlaceName", "HHtcAGkfuz");
        setIntField(term76749, term76749.getClass(), "lastAllNetId", -2019481765);
        setIntField(term76749, term76749.getClass(), "lastRegionId", -425787036);
        setField(term76749, term76749.getClass(), "lastRegionName", "QZCuYHcIBC");
        setField(term76749, term76749.getClass(), "lastClientId", "hpvoFaAyIu");
        setField(term76749, term76749.getClass(), "lastCountryCode", "dyqukIBJxC");
        setIntField(term76749, term76749.getClass(), "lastSelectEMoney", 1522770510);
        setIntField(term76749, term76749.getClass(), "lastSelectTicket", -1935030297);
        setIntField(term76749, term76749.getClass(), "lastSelectCourse", -1877013372);
        setIntField(term76749, term76749.getClass(), "lastCountCourse", 1193388232);
        setField(term76749, term76749.getClass(), "firstGameId", "MVMiGQdgnX");
        setField(term76749, term76749.getClass(), "firstRomVersion", "cQnJIENJHe");
        setField(term76749, term76749.getClass(), "firstDataVersion", "ExjdCvAxlG");
        setField(term76749, term76749.getClass(), "firstPlayDate", "moMySSiBuB");
        setField(term76749, term76749.getClass(), "compatibleCmVersion", "iuuazALDWB");
        setField(term76749, term76749.getClass(), "dailyBonusDate", "GqehccUels");
        setField(term76749, term76749.getClass(), "dailyCourseBonusDate", "llbDGujrPe");
        setField(term76749, term76749.getClass(), "lastPairLoginDate", "QEoeITwBfz");
        setField(term76749, term76749.getClass(), "lastTrialPlayDate", "rWOKjAUIvS");
        setIntField(term76749, term76749.getClass(), "playVsCount", 1908942563);
        setIntField(term76749, term76749.getClass(), "playSyncCount", 1566557753);
        setIntField(term76749, term76749.getClass(), "winCount", 1717239995);
        setIntField(term76749, term76749.getClass(), "helpCount", -2127412745);
        setIntField(term76749, term76749.getClass(), "comboCount", -891519278);
        setLongField(term76749, term76749.getClass(), "totalDeluxscore", -3847444891371711747L);
        setLongField(term76749, term76749.getClass(), "totalBasicDeluxscore", 1696001790379760891L);
        setLongField(term76749, term76749.getClass(), "totalAdvancedDeluxscore", -4760671466516104310L);
        setLongField(term76749, term76749.getClass(), "totalExpertDeluxscore", -3970755845974448262L);
        setLongField(term76749, term76749.getClass(), "totalMasterDeluxscore", -4656203828034599503L);
        setLongField(term76749, term76749.getClass(), "totalReMasterDeluxscore", 3237415194577624898L);
        setIntField(term76749, term76749.getClass(), "totalSync", 1794839887);
        setIntField(term76749, term76749.getClass(), "totalBasicSync", 517802429);
        setIntField(term76749, term76749.getClass(), "totalAdvancedSync", 2029166588);
        setIntField(term76749, term76749.getClass(), "totalExpertSync", -834807352);
        setIntField(term76749, term76749.getClass(), "totalMasterSync", -1760219909);
        setIntField(term76749, term76749.getClass(), "totalReMasterSync", -1053825347);
        setLongField(term76749, term76749.getClass(), "totalAchievement", -872408877635399846L);
        setLongField(term76749, term76749.getClass(), "totalBasicAchievement", -6901566663896579785L);
        setLongField(term76749, term76749.getClass(), "totalAdvancedAchievement", 5118165509511383169L);
        setLongField(term76749, term76749.getClass(), "totalExpertAchievement", 8864542556121360562L);
        setLongField(term76749, term76749.getClass(), "totalMasterAchievement", 3559897534417114240L);
        setLongField(term76749, term76749.getClass(), "totalReMasterAchievement", 3228901614122818656L);
        setLongField(term76749, term76749.getClass(), "playerOldRating", 2202429793916533652L);
        setLongField(term76749, term76749.getClass(), "playerNewRating", -2912979631418915478L);
        setIntField(term76749, term76749.getClass(), "banState", 2141886355);
        setLongField(term76749, term76749.getClass(), "dateTime", 3588543938790387865L);
        setField(term76747, term76747.getClass(), "user", term76749);
        setIntField(term76747, term76747.getClass(), "courseId", -979489727);
        setBooleanField(term76747, term76747.getClass(), "isLastClear", true);
        setIntField(term76747, term76747.getClass(), "totalRestlife", -1339607020);
        setIntField(term76747, term76747.getClass(), "totalAchievement", 21710763);
        setIntField(term76747, term76747.getClass(), "totalDeluxscore", -1638359261);
        setIntField(term76747, term76747.getClass(), "playCount", -1738702221);
        setField(term76747, term76747.getClass(), "clearDate", "IcpfsIGlDf");
        setField(term76747, term76747.getClass(), "lastPlayDate", "xCfGcRdHTK");
        setIntField(term76747, term76747.getClass(), "bestAchievement", 949696394);
        setField(term76747, term76747.getClass(), "bestAchievementDate", "KKHQCvKTvF");
        setIntField(term76747, term76747.getClass(), "bestDeluxscore", 366195895);
        setField(term76747, term76747.getClass(), "bestDeluxscoreDate", "XBhNIIxiNP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearDate", argTypes, term76747, args);
    }

};


