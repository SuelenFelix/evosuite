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

public class UserMusicDetail_getPlayCount_9969032125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57824;

    public UserMusicDetail_getPlayCount_9969032125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57830 = new Long(5836128569274066678L);
        Integer term57893 = new Integer(-1576584269);
        Integer term57895 = new Integer(1474899591);
        Integer term57897 = new Integer(297582552);
        ArrayList term57891 = new ArrayList();
        ((ArrayList) term57891).add(term57893);
        ((ArrayList) term57891).add(term57895);
        ((ArrayList) term57891).add(term57897);
        Integer term57903 = new Integer(-1485916498);
        Integer term57905 = new Integer(722787672);
        Integer term57907 = new Integer(2077491675);
        Integer term57909 = new Integer(-1728316609);
        Integer term57911 = new Integer(47118909);
        Integer term57913 = new Integer(-2093707412);
        ArrayList term57901 = new ArrayList();
        ((ArrayList) term57901).add(term57903);
        ((ArrayList) term57901).add(term57905);
        ((ArrayList) term57901).add(term57907);
        ((ArrayList) term57901).add(term57909);
        ((ArrayList) term57901).add(term57911);
        ((ArrayList) term57901).add(term57913);
        term57824 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term57826 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term57828 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57859 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57824, term57824.getClass(), "id", -4520530213003895999L);
        setLongField(term57826, term57826.getClass(), "id", 1915067600167472834L);
        setLongField(term57828, term57828.getClass(), "id", -5052214162065838650L);
        setField(term57828, term57828.getClass(), "extId", term57830);
        setField(term57828, term57828.getClass(), "luid", "TvmWaJWmLY");
        setIntField(term57845, term57845.getClass(), "year", 2022);
        setShortField(term57845, term57845.getClass(), "month", (short) 5);
        setShortField(term57845, term57845.getClass(), "day", (short) 29);
        setField(term57844, term57844.getClass(), "date", term57845);
        setByteField(term57849, term57849.getClass(), "hour", (byte) 11);
        setByteField(term57849, term57849.getClass(), "minute", (byte) 41);
        setByteField(term57849, term57849.getClass(), "second", (byte) 43);
        setIntField(term57849, term57849.getClass(), "nano", 984890757);
        setField(term57844, term57844.getClass(), "time", term57849);
        setField(term57828, term57828.getClass(), "registerTime", term57844);
        setIntField(term57855, term57855.getClass(), "year", 2029);
        setShortField(term57855, term57855.getClass(), "month", (short) 4);
        setShortField(term57855, term57855.getClass(), "day", (short) 27);
        setField(term57854, term57854.getClass(), "date", term57855);
        setByteField(term57859, term57859.getClass(), "hour", (byte) 16);
        setByteField(term57859, term57859.getClass(), "minute", (byte) 25);
        setByteField(term57859, term57859.getClass(), "second", (byte) 10);
        setIntField(term57859, term57859.getClass(), "nano", 699018782);
        setField(term57854, term57854.getClass(), "time", term57859);
        setField(term57828, term57828.getClass(), "accessTime", term57854);
        setField(term57826, term57826.getClass(), "card", term57828);
        setField(term57826, term57826.getClass(), "userName", "TSUdwgvHgU");
        setIntField(term57826, term57826.getClass(), "isNetMember", -671595545);
        setIntField(term57826, term57826.getClass(), "iconId", -143541686);
        setIntField(term57826, term57826.getClass(), "plateId", -1201234880);
        setIntField(term57826, term57826.getClass(), "titleId", 1402881126);
        setIntField(term57826, term57826.getClass(), "partnerId", 786987666);
        setIntField(term57826, term57826.getClass(), "frameId", 1810592574);
        setIntField(term57826, term57826.getClass(), "selectMapId", 1394978641);
        setIntField(term57826, term57826.getClass(), "totalAwake", 1085224973);
        setIntField(term57826, term57826.getClass(), "gradeRating", 580824436);
        setIntField(term57826, term57826.getClass(), "musicRating", 400588448);
        setIntField(term57826, term57826.getClass(), "playerRating", -798151545);
        setIntField(term57826, term57826.getClass(), "highestRating", -243386399);
        setIntField(term57826, term57826.getClass(), "gradeRank", 1238856040);
        setIntField(term57826, term57826.getClass(), "classRank", -171442968);
        setIntField(term57826, term57826.getClass(), "courseRank", 1345075451);
        setField(term57826, term57826.getClass(), "charaSlot", term57891);
        setField(term57826, term57826.getClass(), "charaLockSlot", term57901);
        setLongField(term57826, term57826.getClass(), "contentBit", -94222650078853780L);
        setIntField(term57826, term57826.getClass(), "playCount", -482097687);
        setField(term57826, term57826.getClass(), "eventWatchedDate", "YBQxTjzIrN");
        setField(term57826, term57826.getClass(), "lastGameId", "xfqaJVcHGx");
        setField(term57826, term57826.getClass(), "lastRomVersion", "bANxpqKESI");
        setField(term57826, term57826.getClass(), "lastDataVersion", "sgpUSVSuVZ");
        setField(term57826, term57826.getClass(), "lastLoginDate", "ZOYhOzwINI");
        setField(term57826, term57826.getClass(), "lastPlayDate", "sPqjQQfymN");
        setIntField(term57826, term57826.getClass(), "lastPlayCredit", -1155698012);
        setIntField(term57826, term57826.getClass(), "lastPlayMode", -1635314310);
        setIntField(term57826, term57826.getClass(), "lastPlaceId", -1583672247);
        setField(term57826, term57826.getClass(), "lastPlaceName", "tNKFzflLBd");
        setIntField(term57826, term57826.getClass(), "lastAllNetId", 1150713854);
        setIntField(term57826, term57826.getClass(), "lastRegionId", 999843869);
        setField(term57826, term57826.getClass(), "lastRegionName", "xHLlctEoGh");
        setField(term57826, term57826.getClass(), "lastClientId", "aqgUzcnqpE");
        setField(term57826, term57826.getClass(), "lastCountryCode", "yZDlWLIKEp");
        setIntField(term57826, term57826.getClass(), "lastSelectEMoney", 1047162942);
        setIntField(term57826, term57826.getClass(), "lastSelectTicket", 555668629);
        setIntField(term57826, term57826.getClass(), "lastSelectCourse", -704789127);
        setIntField(term57826, term57826.getClass(), "lastCountCourse", 2018335018);
        setField(term57826, term57826.getClass(), "firstGameId", "dAEiXUxDrI");
        setField(term57826, term57826.getClass(), "firstRomVersion", "AgQWngzXPH");
        setField(term57826, term57826.getClass(), "firstDataVersion", "EZJmAIzdHM");
        setField(term57826, term57826.getClass(), "firstPlayDate", "LAOkeXXkDr");
        setField(term57826, term57826.getClass(), "compatibleCmVersion", "YkZqFgrgVM");
        setField(term57826, term57826.getClass(), "dailyBonusDate", "QEJBgSNviH");
        setField(term57826, term57826.getClass(), "dailyCourseBonusDate", "bjigisSVNp");
        setField(term57826, term57826.getClass(), "lastPairLoginDate", "yJCCaWqQuK");
        setField(term57826, term57826.getClass(), "lastTrialPlayDate", "tgBNqkdndl");
        setIntField(term57826, term57826.getClass(), "playVsCount", 524629103);
        setIntField(term57826, term57826.getClass(), "playSyncCount", 601775827);
        setIntField(term57826, term57826.getClass(), "winCount", 1713144877);
        setIntField(term57826, term57826.getClass(), "helpCount", -513074841);
        setIntField(term57826, term57826.getClass(), "comboCount", -1384079183);
        setLongField(term57826, term57826.getClass(), "totalDeluxscore", -2164399567942958295L);
        setLongField(term57826, term57826.getClass(), "totalBasicDeluxscore", 6485127487584904536L);
        setLongField(term57826, term57826.getClass(), "totalAdvancedDeluxscore", 6217646173265243924L);
        setLongField(term57826, term57826.getClass(), "totalExpertDeluxscore", 4772045766380729761L);
        setLongField(term57826, term57826.getClass(), "totalMasterDeluxscore", -5215160586515108435L);
        setLongField(term57826, term57826.getClass(), "totalReMasterDeluxscore", -2509873143781504715L);
        setIntField(term57826, term57826.getClass(), "totalSync", -1401413822);
        setIntField(term57826, term57826.getClass(), "totalBasicSync", -1735958377);
        setIntField(term57826, term57826.getClass(), "totalAdvancedSync", -477618469);
        setIntField(term57826, term57826.getClass(), "totalExpertSync", 117739625);
        setIntField(term57826, term57826.getClass(), "totalMasterSync", -314816968);
        setIntField(term57826, term57826.getClass(), "totalReMasterSync", -1478972076);
        setLongField(term57826, term57826.getClass(), "totalAchievement", -4904759676997645613L);
        setLongField(term57826, term57826.getClass(), "totalBasicAchievement", -2640287313269620296L);
        setLongField(term57826, term57826.getClass(), "totalAdvancedAchievement", -6079558432202737241L);
        setLongField(term57826, term57826.getClass(), "totalExpertAchievement", -3787130598270460761L);
        setLongField(term57826, term57826.getClass(), "totalMasterAchievement", 3458780357847556173L);
        setLongField(term57826, term57826.getClass(), "totalReMasterAchievement", -252234842640503104L);
        setLongField(term57826, term57826.getClass(), "playerOldRating", -4237738930912633869L);
        setLongField(term57826, term57826.getClass(), "playerNewRating", -3539678318307233375L);
        setIntField(term57826, term57826.getClass(), "banState", 828708445);
        setLongField(term57826, term57826.getClass(), "dateTime", -256569768909962991L);
        setField(term57824, term57824.getClass(), "user", term57826);
        setIntField(term57824, term57824.getClass(), "musicId", -1198357943);
        setIntField(term57824, term57824.getClass(), "level", 407342373);
        setIntField(term57824, term57824.getClass(), "playCount", 633857490);
        setIntField(term57824, term57824.getClass(), "achievement", -602285518);
        setIntField(term57824, term57824.getClass(), "comboStatus", 95548457);
        setIntField(term57824, term57824.getClass(), "syncStatus", -652818479);
        setIntField(term57824, term57824.getClass(), "deluxscoreMax", 909221962);
        setIntField(term57824, term57824.getClass(), "scoreRank", 1036562171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term57824, args);
    }

};


