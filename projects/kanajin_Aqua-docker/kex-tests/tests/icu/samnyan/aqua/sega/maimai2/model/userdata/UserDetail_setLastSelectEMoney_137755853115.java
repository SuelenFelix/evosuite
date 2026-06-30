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

public class UserDetail_setLastSelectEMoney_137755853115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260459;
     Object term260810;

    public UserDetail_setLastSelectEMoney_137755853115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term260463 = new Long(970120292495348028L);
        Integer term260526 = new Integer(2018335018);
        Integer term260528 = new Integer(524629103);
        ArrayList term260524 = new ArrayList();
        ((ArrayList) term260524).add(term260526);
        ((ArrayList) term260524).add(term260528);
        Integer term260534 = new Integer(601775827);
        Integer term260536 = new Integer(1713144877);
        Integer term260538 = new Integer(-513074841);
        Integer term260540 = new Integer(-1384079183);
        ArrayList term260532 = new ArrayList();
        ((ArrayList) term260532).add(term260534);
        ((ArrayList) term260532).add(term260536);
        ((ArrayList) term260532).add(term260538);
        ((ArrayList) term260532).add(term260540);
        term260459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term260461 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term260477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term260487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term260459, term260459.getClass(), "id", 1612938500995032826L);
        setLongField(term260461, term260461.getClass(), "id", -3836601769713036251L);
        setField(term260461, term260461.getClass(), "extId", term260463);
        setField(term260461, term260461.getClass(), "luid", "iSXUZmUzsG");
        setIntField(term260478, term260478.getClass(), "year", 2013);
        setShortField(term260478, term260478.getClass(), "month", (short) 9);
        setShortField(term260478, term260478.getClass(), "day", (short) 18);
        setField(term260477, term260477.getClass(), "date", term260478);
        setByteField(term260482, term260482.getClass(), "hour", (byte) 0);
        setByteField(term260482, term260482.getClass(), "minute", (byte) 40);
        setByteField(term260482, term260482.getClass(), "second", (byte) 5);
        setIntField(term260482, term260482.getClass(), "nano", 735661180);
        setField(term260477, term260477.getClass(), "time", term260482);
        setField(term260461, term260461.getClass(), "registerTime", term260477);
        setIntField(term260488, term260488.getClass(), "year", 2024);
        setShortField(term260488, term260488.getClass(), "month", (short) 4);
        setShortField(term260488, term260488.getClass(), "day", (short) 18);
        setField(term260487, term260487.getClass(), "date", term260488);
        setByteField(term260492, term260492.getClass(), "hour", (byte) 16);
        setByteField(term260492, term260492.getClass(), "minute", (byte) 24);
        setByteField(term260492, term260492.getClass(), "second", (byte) 38);
        setIntField(term260492, term260492.getClass(), "nano", 339757581);
        setField(term260487, term260487.getClass(), "time", term260492);
        setField(term260461, term260461.getClass(), "accessTime", term260487);
        setField(term260459, term260459.getClass(), "card", term260461);
        setField(term260459, term260459.getClass(), "userName", "wCLSYvOrxz");
        setIntField(term260459, term260459.getClass(), "isNetMember", 1950766545);
        setIntField(term260459, term260459.getClass(), "iconId", 1718715106);
        setIntField(term260459, term260459.getClass(), "plateId", -595632133);
        setIntField(term260459, term260459.getClass(), "titleId", 1250894608);
        setIntField(term260459, term260459.getClass(), "partnerId", -39371116);
        setIntField(term260459, term260459.getClass(), "frameId", -1609922034);
        setIntField(term260459, term260459.getClass(), "selectMapId", -1252181986);
        setIntField(term260459, term260459.getClass(), "totalAwake", -742736453);
        setIntField(term260459, term260459.getClass(), "gradeRating", -1062660823);
        setIntField(term260459, term260459.getClass(), "musicRating", 2055256521);
        setIntField(term260459, term260459.getClass(), "playerRating", 956026562);
        setIntField(term260459, term260459.getClass(), "highestRating", -909171290);
        setIntField(term260459, term260459.getClass(), "gradeRank", -1009529089);
        setIntField(term260459, term260459.getClass(), "classRank", -16062487);
        setIntField(term260459, term260459.getClass(), "courseRank", 1410112213);
        setField(term260459, term260459.getClass(), "charaSlot", term260524);
        setField(term260459, term260459.getClass(), "charaLockSlot", term260532);
        setLongField(term260459, term260459.getClass(), "contentBit", -7040013520608105562L);
        setIntField(term260459, term260459.getClass(), "playCount", -1645874956);
        setField(term260459, term260459.getClass(), "eventWatchedDate", "rzlCRHVFsA");
        setField(term260459, term260459.getClass(), "lastGameId", "XICyfUgpjZ");
        setField(term260459, term260459.getClass(), "lastRomVersion", "SOwukZbyqx");
        setField(term260459, term260459.getClass(), "lastDataVersion", "BPCRnKSWXh");
        setField(term260459, term260459.getClass(), "lastLoginDate", "QawFvvoVNe");
        setField(term260459, term260459.getClass(), "lastPlayDate", "JMmYwwRqLn");
        setIntField(term260459, term260459.getClass(), "lastPlayCredit", -1602616879);
        setIntField(term260459, term260459.getClass(), "lastPlayMode", -941452631);
        setIntField(term260459, term260459.getClass(), "lastPlaceId", -2137532556);
        setField(term260459, term260459.getClass(), "lastPlaceName", "wiHmWKChBU");
        setIntField(term260459, term260459.getClass(), "lastAllNetId", -128208537);
        setIntField(term260459, term260459.getClass(), "lastRegionId", 384209724);
        setField(term260459, term260459.getClass(), "lastRegionName", "slHIDqbhVK");
        setField(term260459, term260459.getClass(), "lastClientId", "lcdIOwjGRb");
        setField(term260459, term260459.getClass(), "lastCountryCode", "iVMKgSDqtv");
        setIntField(term260459, term260459.getClass(), "lastSelectEMoney", 1474730667);
        setIntField(term260459, term260459.getClass(), "lastSelectTicket", 1024806817);
        setIntField(term260459, term260459.getClass(), "lastSelectCourse", -1756207099);
        setIntField(term260459, term260459.getClass(), "lastCountCourse", -755151471);
        setField(term260459, term260459.getClass(), "firstGameId", "snUMTDsDAQ");
        setField(term260459, term260459.getClass(), "firstRomVersion", "mLLEZxImzO");
        setField(term260459, term260459.getClass(), "firstDataVersion", "pmCySZHNoC");
        setField(term260459, term260459.getClass(), "firstPlayDate", "WvaVoeUTqA");
        setField(term260459, term260459.getClass(), "compatibleCmVersion", "dkswgBXyfe");
        setField(term260459, term260459.getClass(), "dailyBonusDate", "YHtTpcXHtC");
        setField(term260459, term260459.getClass(), "dailyCourseBonusDate", "uqzybgAbHn");
        setField(term260459, term260459.getClass(), "lastPairLoginDate", "bVWOnKMYwA");
        setField(term260459, term260459.getClass(), "lastTrialPlayDate", "IQqGtjQIFE");
        setIntField(term260459, term260459.getClass(), "playVsCount", 606148929);
        setIntField(term260459, term260459.getClass(), "playSyncCount", -677793486);
        setIntField(term260459, term260459.getClass(), "winCount", -1703604488);
        setIntField(term260459, term260459.getClass(), "helpCount", 848260588);
        setIntField(term260459, term260459.getClass(), "comboCount", 1339938535);
        setLongField(term260459, term260459.getClass(), "totalDeluxscore", -7895183301452250327L);
        setLongField(term260459, term260459.getClass(), "totalBasicDeluxscore", -539981667744111145L);
        setLongField(term260459, term260459.getClass(), "totalAdvancedDeluxscore", -5993380625929129323L);
        setLongField(term260459, term260459.getClass(), "totalExpertDeluxscore", 2526215662728691L);
        setLongField(term260459, term260459.getClass(), "totalMasterDeluxscore", -6476293666362545738L);
        setLongField(term260459, term260459.getClass(), "totalReMasterDeluxscore", -8774422839316211168L);
        setIntField(term260459, term260459.getClass(), "totalSync", 1804704524);
        setIntField(term260459, term260459.getClass(), "totalBasicSync", -900768331);
        setIntField(term260459, term260459.getClass(), "totalAdvancedSync", -1994227835);
        setIntField(term260459, term260459.getClass(), "totalExpertSync", 986916372);
        setIntField(term260459, term260459.getClass(), "totalMasterSync", -1033708911);
        setIntField(term260459, term260459.getClass(), "totalReMasterSync", 1494952800);
        setLongField(term260459, term260459.getClass(), "totalAchievement", -869600002344382110L);
        setLongField(term260459, term260459.getClass(), "totalBasicAchievement", -825610262047824925L);
        setLongField(term260459, term260459.getClass(), "totalAdvancedAchievement", -495668312671609799L);
        setLongField(term260459, term260459.getClass(), "totalExpertAchievement", -105363883036744695L);
        setLongField(term260459, term260459.getClass(), "totalMasterAchievement", -8082575982564397268L);
        setLongField(term260459, term260459.getClass(), "totalReMasterAchievement", 6783442640032428233L);
        setLongField(term260459, term260459.getClass(), "playerOldRating", 4970331591654297155L);
        setLongField(term260459, term260459.getClass(), "playerNewRating", 6096127312057821738L);
        setIntField(term260459, term260459.getClass(), "banState", 704190533);
        setLongField(term260459, term260459.getClass(), "dateTime", 6721953702809768346L);
        term260810 = new Integer(-793303503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term260810;
        callMethod(klass, "setLastSelectEMoney", argTypes, term260459, args);
    }

};


