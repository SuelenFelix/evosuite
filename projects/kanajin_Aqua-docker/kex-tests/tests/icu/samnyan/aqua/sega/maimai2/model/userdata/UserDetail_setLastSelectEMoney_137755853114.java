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

public class UserDetail_setLastSelectEMoney_137755853114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260404;
     Object term260755;

    public UserDetail_setLastSelectEMoney_137755853114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term260408 = new Long(970120292495348028L);
        Integer term260471 = new Integer(2018335018);
        Integer term260473 = new Integer(524629103);
        ArrayList term260469 = new ArrayList();
        ((ArrayList) term260469).add(term260471);
        ((ArrayList) term260469).add(term260473);
        Integer term260479 = new Integer(601775827);
        Integer term260481 = new Integer(1713144877);
        Integer term260483 = new Integer(-513074841);
        Integer term260485 = new Integer(-1384079183);
        ArrayList term260477 = new ArrayList();
        ((ArrayList) term260477).add(term260479);
        ((ArrayList) term260477).add(term260481);
        ((ArrayList) term260477).add(term260483);
        ((ArrayList) term260477).add(term260485);
        term260404 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term260406 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term260422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term260432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260437 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term260404, term260404.getClass(), "id", 1612938500995032826L);
        setLongField(term260406, term260406.getClass(), "id", -3836601769713036251L);
        setField(term260406, term260406.getClass(), "extId", term260408);
        setField(term260406, term260406.getClass(), "luid", "iSXUZmUzsG");
        setIntField(term260423, term260423.getClass(), "year", 2013);
        setShortField(term260423, term260423.getClass(), "month", (short) 9);
        setShortField(term260423, term260423.getClass(), "day", (short) 18);
        setField(term260422, term260422.getClass(), "date", term260423);
        setByteField(term260427, term260427.getClass(), "hour", (byte) 0);
        setByteField(term260427, term260427.getClass(), "minute", (byte) 40);
        setByteField(term260427, term260427.getClass(), "second", (byte) 5);
        setIntField(term260427, term260427.getClass(), "nano", 735661180);
        setField(term260422, term260422.getClass(), "time", term260427);
        setField(term260406, term260406.getClass(), "registerTime", term260422);
        setIntField(term260433, term260433.getClass(), "year", 2024);
        setShortField(term260433, term260433.getClass(), "month", (short) 4);
        setShortField(term260433, term260433.getClass(), "day", (short) 18);
        setField(term260432, term260432.getClass(), "date", term260433);
        setByteField(term260437, term260437.getClass(), "hour", (byte) 16);
        setByteField(term260437, term260437.getClass(), "minute", (byte) 24);
        setByteField(term260437, term260437.getClass(), "second", (byte) 38);
        setIntField(term260437, term260437.getClass(), "nano", 339757581);
        setField(term260432, term260432.getClass(), "time", term260437);
        setField(term260406, term260406.getClass(), "accessTime", term260432);
        setField(term260404, term260404.getClass(), "card", term260406);
        setField(term260404, term260404.getClass(), "userName", "wCLSYvOrxz");
        setIntField(term260404, term260404.getClass(), "isNetMember", 1950766545);
        setIntField(term260404, term260404.getClass(), "iconId", 1718715106);
        setIntField(term260404, term260404.getClass(), "plateId", -595632133);
        setIntField(term260404, term260404.getClass(), "titleId", 1250894608);
        setIntField(term260404, term260404.getClass(), "partnerId", -39371116);
        setIntField(term260404, term260404.getClass(), "frameId", -1609922034);
        setIntField(term260404, term260404.getClass(), "selectMapId", -1252181986);
        setIntField(term260404, term260404.getClass(), "totalAwake", -742736453);
        setIntField(term260404, term260404.getClass(), "gradeRating", -1062660823);
        setIntField(term260404, term260404.getClass(), "musicRating", 2055256521);
        setIntField(term260404, term260404.getClass(), "playerRating", 956026562);
        setIntField(term260404, term260404.getClass(), "highestRating", -909171290);
        setIntField(term260404, term260404.getClass(), "gradeRank", -1009529089);
        setIntField(term260404, term260404.getClass(), "classRank", -16062487);
        setIntField(term260404, term260404.getClass(), "courseRank", 1410112213);
        setField(term260404, term260404.getClass(), "charaSlot", term260469);
        setField(term260404, term260404.getClass(), "charaLockSlot", term260477);
        setLongField(term260404, term260404.getClass(), "contentBit", -7040013520608105562L);
        setIntField(term260404, term260404.getClass(), "playCount", -1645874956);
        setField(term260404, term260404.getClass(), "eventWatchedDate", "rzlCRHVFsA");
        setField(term260404, term260404.getClass(), "lastGameId", "XICyfUgpjZ");
        setField(term260404, term260404.getClass(), "lastRomVersion", "SOwukZbyqx");
        setField(term260404, term260404.getClass(), "lastDataVersion", "BPCRnKSWXh");
        setField(term260404, term260404.getClass(), "lastLoginDate", "QawFvvoVNe");
        setField(term260404, term260404.getClass(), "lastPlayDate", "JMmYwwRqLn");
        setIntField(term260404, term260404.getClass(), "lastPlayCredit", -1602616879);
        setIntField(term260404, term260404.getClass(), "lastPlayMode", -941452631);
        setIntField(term260404, term260404.getClass(), "lastPlaceId", -2137532556);
        setField(term260404, term260404.getClass(), "lastPlaceName", "wiHmWKChBU");
        setIntField(term260404, term260404.getClass(), "lastAllNetId", -128208537);
        setIntField(term260404, term260404.getClass(), "lastRegionId", 384209724);
        setField(term260404, term260404.getClass(), "lastRegionName", "slHIDqbhVK");
        setField(term260404, term260404.getClass(), "lastClientId", "lcdIOwjGRb");
        setField(term260404, term260404.getClass(), "lastCountryCode", "iVMKgSDqtv");
        setIntField(term260404, term260404.getClass(), "lastSelectEMoney", 1474730667);
        setIntField(term260404, term260404.getClass(), "lastSelectTicket", 1024806817);
        setIntField(term260404, term260404.getClass(), "lastSelectCourse", -1756207099);
        setIntField(term260404, term260404.getClass(), "lastCountCourse", -755151471);
        setField(term260404, term260404.getClass(), "firstGameId", "snUMTDsDAQ");
        setField(term260404, term260404.getClass(), "firstRomVersion", "mLLEZxImzO");
        setField(term260404, term260404.getClass(), "firstDataVersion", "pmCySZHNoC");
        setField(term260404, term260404.getClass(), "firstPlayDate", "WvaVoeUTqA");
        setField(term260404, term260404.getClass(), "compatibleCmVersion", "dkswgBXyfe");
        setField(term260404, term260404.getClass(), "dailyBonusDate", "YHtTpcXHtC");
        setField(term260404, term260404.getClass(), "dailyCourseBonusDate", "uqzybgAbHn");
        setField(term260404, term260404.getClass(), "lastPairLoginDate", "bVWOnKMYwA");
        setField(term260404, term260404.getClass(), "lastTrialPlayDate", "IQqGtjQIFE");
        setIntField(term260404, term260404.getClass(), "playVsCount", 606148929);
        setIntField(term260404, term260404.getClass(), "playSyncCount", -677793486);
        setIntField(term260404, term260404.getClass(), "winCount", -1703604488);
        setIntField(term260404, term260404.getClass(), "helpCount", 848260588);
        setIntField(term260404, term260404.getClass(), "comboCount", 1339938535);
        setLongField(term260404, term260404.getClass(), "totalDeluxscore", -7895183301452250327L);
        setLongField(term260404, term260404.getClass(), "totalBasicDeluxscore", -539981667744111145L);
        setLongField(term260404, term260404.getClass(), "totalAdvancedDeluxscore", -5993380625929129323L);
        setLongField(term260404, term260404.getClass(), "totalExpertDeluxscore", 2526215662728691L);
        setLongField(term260404, term260404.getClass(), "totalMasterDeluxscore", -6476293666362545738L);
        setLongField(term260404, term260404.getClass(), "totalReMasterDeluxscore", -8774422839316211168L);
        setIntField(term260404, term260404.getClass(), "totalSync", 1804704524);
        setIntField(term260404, term260404.getClass(), "totalBasicSync", -900768331);
        setIntField(term260404, term260404.getClass(), "totalAdvancedSync", -1994227835);
        setIntField(term260404, term260404.getClass(), "totalExpertSync", 986916372);
        setIntField(term260404, term260404.getClass(), "totalMasterSync", -1033708911);
        setIntField(term260404, term260404.getClass(), "totalReMasterSync", 1494952800);
        setLongField(term260404, term260404.getClass(), "totalAchievement", -869600002344382110L);
        setLongField(term260404, term260404.getClass(), "totalBasicAchievement", -825610262047824925L);
        setLongField(term260404, term260404.getClass(), "totalAdvancedAchievement", -495668312671609799L);
        setLongField(term260404, term260404.getClass(), "totalExpertAchievement", -105363883036744695L);
        setLongField(term260404, term260404.getClass(), "totalMasterAchievement", -8082575982564397268L);
        setLongField(term260404, term260404.getClass(), "totalReMasterAchievement", 6783442640032428233L);
        setLongField(term260404, term260404.getClass(), "playerOldRating", 4970331591654297155L);
        setLongField(term260404, term260404.getClass(), "playerNewRating", 6096127312057821738L);
        setIntField(term260404, term260404.getClass(), "banState", 704190533);
        setLongField(term260404, term260404.getClass(), "dateTime", 6721953702809768346L);
        term260755 = new Integer(-793303503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term260755;
        callMethod(klass, "setLastSelectEMoney", argTypes, term260404, args);
    }

};


