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

public class UserMusicDetail_init_8224672640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54969;

    public UserMusicDetail_init_8224672640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54973 = new Long(4474998035090263139L);
        Integer term55036 = new Integer(2073858334);
        ArrayList term55034 = new ArrayList();
        ((ArrayList) term55034).add(term55036);
        ArrayList term55040 = new ArrayList();
        term54969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term54971 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55002 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54969, term54969.getClass(), "id", -4609129422862658333L);
        setLongField(term54971, term54971.getClass(), "id", 4606742231634944447L);
        setField(term54971, term54971.getClass(), "extId", term54973);
        setField(term54971, term54971.getClass(), "luid", "MQvSpklpkB");
        setIntField(term54988, term54988.getClass(), "year", 2026);
        setShortField(term54988, term54988.getClass(), "month", (short) 7);
        setShortField(term54988, term54988.getClass(), "day", (short) 4);
        setField(term54987, term54987.getClass(), "date", term54988);
        setByteField(term54992, term54992.getClass(), "hour", (byte) 8);
        setByteField(term54992, term54992.getClass(), "minute", (byte) 51);
        setByteField(term54992, term54992.getClass(), "second", (byte) 9);
        setIntField(term54992, term54992.getClass(), "nano", 936880887);
        setField(term54987, term54987.getClass(), "time", term54992);
        setField(term54971, term54971.getClass(), "registerTime", term54987);
        setIntField(term54998, term54998.getClass(), "year", 2022);
        setShortField(term54998, term54998.getClass(), "month", (short) 5);
        setShortField(term54998, term54998.getClass(), "day", (short) 26);
        setField(term54997, term54997.getClass(), "date", term54998);
        setByteField(term55002, term55002.getClass(), "hour", (byte) 6);
        setByteField(term55002, term55002.getClass(), "minute", (byte) 54);
        setByteField(term55002, term55002.getClass(), "second", (byte) 49);
        setIntField(term55002, term55002.getClass(), "nano", 822216068);
        setField(term54997, term54997.getClass(), "time", term55002);
        setField(term54971, term54971.getClass(), "accessTime", term54997);
        setField(term54969, term54969.getClass(), "card", term54971);
        setField(term54969, term54969.getClass(), "userName", "SbTxRdDQQc");
        setIntField(term54969, term54969.getClass(), "isNetMember", -1945706596);
        setIntField(term54969, term54969.getClass(), "iconId", 13487895);
        setIntField(term54969, term54969.getClass(), "plateId", 369911284);
        setIntField(term54969, term54969.getClass(), "titleId", 1488504614);
        setIntField(term54969, term54969.getClass(), "partnerId", 661477727);
        setIntField(term54969, term54969.getClass(), "frameId", 274618169);
        setIntField(term54969, term54969.getClass(), "selectMapId", -1618606893);
        setIntField(term54969, term54969.getClass(), "totalAwake", -560211840);
        setIntField(term54969, term54969.getClass(), "gradeRating", 103542361);
        setIntField(term54969, term54969.getClass(), "musicRating", -1737221099);
        setIntField(term54969, term54969.getClass(), "playerRating", -1032313881);
        setIntField(term54969, term54969.getClass(), "highestRating", 1246554458);
        setIntField(term54969, term54969.getClass(), "gradeRank", -1913837862);
        setIntField(term54969, term54969.getClass(), "classRank", -1428994415);
        setIntField(term54969, term54969.getClass(), "courseRank", -1086104799);
        setField(term54969, term54969.getClass(), "charaSlot", term55034);
        setField(term54969, term54969.getClass(), "charaLockSlot", term55040);
        setLongField(term54969, term54969.getClass(), "contentBit", 1182124670479030227L);
        setIntField(term54969, term54969.getClass(), "playCount", 1670332444);
        setField(term54969, term54969.getClass(), "eventWatchedDate", "MrVdoUYAdO");
        setField(term54969, term54969.getClass(), "lastGameId", "schPUnVfDW");
        setField(term54969, term54969.getClass(), "lastRomVersion", "CpdMEgjUka");
        setField(term54969, term54969.getClass(), "lastDataVersion", "WRisHdgnmm");
        setField(term54969, term54969.getClass(), "lastLoginDate", "XxZiwWPLOx");
        setField(term54969, term54969.getClass(), "lastPlayDate", "nyqsjMHTba");
        setIntField(term54969, term54969.getClass(), "lastPlayCredit", -1903805864);
        setIntField(term54969, term54969.getClass(), "lastPlayMode", 751123733);
        setIntField(term54969, term54969.getClass(), "lastPlaceId", -2099677081);
        setField(term54969, term54969.getClass(), "lastPlaceName", "ylUHzURWyg");
        setIntField(term54969, term54969.getClass(), "lastAllNetId", -1911852008);
        setIntField(term54969, term54969.getClass(), "lastRegionId", -126937505);
        setField(term54969, term54969.getClass(), "lastRegionName", "VuAuFBlHxQ");
        setField(term54969, term54969.getClass(), "lastClientId", "nOLtCslMMH");
        setField(term54969, term54969.getClass(), "lastCountryCode", "dIQWOeKQVj");
        setIntField(term54969, term54969.getClass(), "lastSelectEMoney", 1600311664);
        setIntField(term54969, term54969.getClass(), "lastSelectTicket", 1505616296);
        setIntField(term54969, term54969.getClass(), "lastSelectCourse", 453453842);
        setIntField(term54969, term54969.getClass(), "lastCountCourse", 591356101);
        setField(term54969, term54969.getClass(), "firstGameId", "tHiDGaNXAL");
        setField(term54969, term54969.getClass(), "firstRomVersion", "VsizBWhPWL");
        setField(term54969, term54969.getClass(), "firstDataVersion", "jAFSxnVMcD");
        setField(term54969, term54969.getClass(), "firstPlayDate", "BuNQAVaNCe");
        setField(term54969, term54969.getClass(), "compatibleCmVersion", "iaYiUQnOLD");
        setField(term54969, term54969.getClass(), "dailyBonusDate", "upnleTLVdf");
        setField(term54969, term54969.getClass(), "dailyCourseBonusDate", "pvjlKAnxzJ");
        setField(term54969, term54969.getClass(), "lastPairLoginDate", "ejxUBDQQKB");
        setField(term54969, term54969.getClass(), "lastTrialPlayDate", "IbOvZLmtSE");
        setIntField(term54969, term54969.getClass(), "playVsCount", 1387849981);
        setIntField(term54969, term54969.getClass(), "playSyncCount", 518095920);
        setIntField(term54969, term54969.getClass(), "winCount", 1333750018);
        setIntField(term54969, term54969.getClass(), "helpCount", 1824319777);
        setIntField(term54969, term54969.getClass(), "comboCount", -942865663);
        setLongField(term54969, term54969.getClass(), "totalDeluxscore", -7781300974767589244L);
        setLongField(term54969, term54969.getClass(), "totalBasicDeluxscore", -1751226545925422063L);
        setLongField(term54969, term54969.getClass(), "totalAdvancedDeluxscore", 8004140060064605966L);
        setLongField(term54969, term54969.getClass(), "totalExpertDeluxscore", 5918878276163368150L);
        setLongField(term54969, term54969.getClass(), "totalMasterDeluxscore", -7624173005251704961L);
        setLongField(term54969, term54969.getClass(), "totalReMasterDeluxscore", 2044380118626071125L);
        setIntField(term54969, term54969.getClass(), "totalSync", 612230460);
        setIntField(term54969, term54969.getClass(), "totalBasicSync", -87837417);
        setIntField(term54969, term54969.getClass(), "totalAdvancedSync", -1864680068);
        setIntField(term54969, term54969.getClass(), "totalExpertSync", 1979269463);
        setIntField(term54969, term54969.getClass(), "totalMasterSync", -1690818607);
        setIntField(term54969, term54969.getClass(), "totalReMasterSync", 252440319);
        setLongField(term54969, term54969.getClass(), "totalAchievement", -8364623164355526163L);
        setLongField(term54969, term54969.getClass(), "totalBasicAchievement", -4293853358216323773L);
        setLongField(term54969, term54969.getClass(), "totalAdvancedAchievement", -474245812336702069L);
        setLongField(term54969, term54969.getClass(), "totalExpertAchievement", -3005158994986938727L);
        setLongField(term54969, term54969.getClass(), "totalMasterAchievement", -7175762262426771446L);
        setLongField(term54969, term54969.getClass(), "totalReMasterAchievement", 337617062500822936L);
        setLongField(term54969, term54969.getClass(), "playerOldRating", -6622023497681653956L);
        setLongField(term54969, term54969.getClass(), "playerNewRating", -6753978337878946291L);
        setIntField(term54969, term54969.getClass(), "banState", -1798089143);
        setLongField(term54969, term54969.getClass(), "dateTime", -6937950410603484933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term54969;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


