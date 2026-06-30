package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getTrophyId_101398884719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29955;

    public UserData_getTrophyId_101398884719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29959 = new Long(305759998609888272L);
        term29955 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term29957 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term29973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29988 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term29955, term29955.getClass(), "id", 1789068809283154146L);
        setLongField(term29957, term29957.getClass(), "id", -6776970214701629330L);
        setField(term29957, term29957.getClass(), "extId", term29959);
        setField(term29957, term29957.getClass(), "luid", "xIeSbezmkD");
        setIntField(term29974, term29974.getClass(), "year", 2023);
        setShortField(term29974, term29974.getClass(), "month", (short) 11);
        setShortField(term29974, term29974.getClass(), "day", (short) 14);
        setField(term29973, term29973.getClass(), "date", term29974);
        setByteField(term29978, term29978.getClass(), "hour", (byte) 15);
        setByteField(term29978, term29978.getClass(), "minute", (byte) 2);
        setByteField(term29978, term29978.getClass(), "second", (byte) 47);
        setIntField(term29978, term29978.getClass(), "nano", 703984770);
        setField(term29973, term29973.getClass(), "time", term29978);
        setField(term29957, term29957.getClass(), "registerTime", term29973);
        setIntField(term29984, term29984.getClass(), "year", 2024);
        setShortField(term29984, term29984.getClass(), "month", (short) 4);
        setShortField(term29984, term29984.getClass(), "day", (short) 26);
        setField(term29983, term29983.getClass(), "date", term29984);
        setByteField(term29988, term29988.getClass(), "hour", (byte) 15);
        setByteField(term29988, term29988.getClass(), "minute", (byte) 12);
        setByteField(term29988, term29988.getClass(), "second", (byte) 31);
        setIntField(term29988, term29988.getClass(), "nano", 839979637);
        setField(term29983, term29983.getClass(), "time", term29988);
        setField(term29957, term29957.getClass(), "accessTime", term29983);
        setField(term29955, term29955.getClass(), "card", term29957);
        setField(term29955, term29955.getClass(), "userName", "txUWLZRkSv");
        setIntField(term29955, term29955.getClass(), "level", 974951631);
        setIntField(term29955, term29955.getClass(), "reincarnationNum", -942202284);
        setLongField(term29955, term29955.getClass(), "exp", 6187687406539061577L);
        setLongField(term29955, term29955.getClass(), "point", -4281700567835283963L);
        setLongField(term29955, term29955.getClass(), "totalPoint", 8779425347424216281L);
        setIntField(term29955, term29955.getClass(), "playCount", -2083254556);
        setIntField(term29955, term29955.getClass(), "jewelCount", 1452346261);
        setIntField(term29955, term29955.getClass(), "totalJewelCount", -548776693);
        setIntField(term29955, term29955.getClass(), "medalCount", 99032275);
        setIntField(term29955, term29955.getClass(), "playerRating", 794098686);
        setIntField(term29955, term29955.getClass(), "highestRating", -1671524013);
        setIntField(term29955, term29955.getClass(), "battlePoint", -438794741);
        setIntField(term29955, term29955.getClass(), "bestBattlePoint", -1400834481);
        setIntField(term29955, term29955.getClass(), "overDamageBattlePoint", 957091706);
        setBooleanField(term29955, term29955.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term29955, term29955.getClass(), "nameplateId", -2011802805);
        setIntField(term29955, term29955.getClass(), "trophyId", -1683802689);
        setIntField(term29955, term29955.getClass(), "cardId", -1949346221);
        setIntField(term29955, term29955.getClass(), "characterId", 831638391);
        setIntField(term29955, term29955.getClass(), "characterVoiceNo", -1184374392);
        setIntField(term29955, term29955.getClass(), "tabSetting", -758870402);
        setIntField(term29955, term29955.getClass(), "tabSortSetting", 72767889);
        setIntField(term29955, term29955.getClass(), "cardCategorySetting", 1699515029);
        setIntField(term29955, term29955.getClass(), "cardSortSetting", 673153263);
        setIntField(term29955, term29955.getClass(), "rivalScoreCategorySetting", -1355715967);
        setIntField(term29955, term29955.getClass(), "playedTutorialBit", -972516789);
        setIntField(term29955, term29955.getClass(), "firstTutorialCancelNum", 720077443);
        setLongField(term29955, term29955.getClass(), "sumTechHighScore", 3878526639209086211L);
        setLongField(term29955, term29955.getClass(), "sumTechBasicHighScore", -2061888799893149465L);
        setLongField(term29955, term29955.getClass(), "sumTechAdvancedHighScore", 8562037929535808010L);
        setLongField(term29955, term29955.getClass(), "sumTechExpertHighScore", 3881743260573639770L);
        setLongField(term29955, term29955.getClass(), "sumTechMasterHighScore", 4805317099230920805L);
        setLongField(term29955, term29955.getClass(), "sumTechLunaticHighScore", -7774176365237911445L);
        setLongField(term29955, term29955.getClass(), "sumBattleHighScore", -4171030293649718675L);
        setLongField(term29955, term29955.getClass(), "sumBattleBasicHighScore", 4157679554798000555L);
        setLongField(term29955, term29955.getClass(), "sumBattleAdvancedHighScore", -6869725878798445523L);
        setLongField(term29955, term29955.getClass(), "sumBattleExpertHighScore", -1338195308090100406L);
        setLongField(term29955, term29955.getClass(), "sumBattleMasterHighScore", 3619359432967414857L);
        setLongField(term29955, term29955.getClass(), "sumBattleLunaticHighScore", 6722117607141885589L);
        setField(term29955, term29955.getClass(), "eventWatchedDate", "gHRMJRsBGm");
        setField(term29955, term29955.getClass(), "cmEventWatchedDate", "rZyrfnMvHa");
        setField(term29955, term29955.getClass(), "firstGameId", "GMyMhTZeDC");
        setField(term29955, term29955.getClass(), "firstRomVersion", "KqQOTshBOL");
        setField(term29955, term29955.getClass(), "firstDataVersion", "cuWgFcYkPC");
        setField(term29955, term29955.getClass(), "firstPlayDate", "HfbcOKkXBm");
        setField(term29955, term29955.getClass(), "lastGameId", "pLbTzSMbsN");
        setField(term29955, term29955.getClass(), "lastRomVersion", "lFSbxerCPP");
        setField(term29955, term29955.getClass(), "lastDataVersion", "vjaZIyixCm");
        setField(term29955, term29955.getClass(), "compatibleCmVersion", "gAAPyftlIR");
        setField(term29955, term29955.getClass(), "lastPlayDate", "kevWstoxwq");
        setIntField(term29955, term29955.getClass(), "lastPlaceId", -884523977);
        setField(term29955, term29955.getClass(), "lastPlaceName", "aSYOhFwzSm");
        setIntField(term29955, term29955.getClass(), "lastRegionId", -1396233580);
        setField(term29955, term29955.getClass(), "lastRegionName", "pVZlzrBeDB");
        setIntField(term29955, term29955.getClass(), "lastAllNetId", -654234892);
        setField(term29955, term29955.getClass(), "lastClientId", "EfSUvjuZAA");
        setIntField(term29955, term29955.getClass(), "lastUsedDeckId", -50930731);
        setIntField(term29955, term29955.getClass(), "lastPlayMusicLevel", -1067876039);
        setIntField(term29955, term29955.getClass(), "lastEmoneyBrand", -1143749623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term29955, args);
    }

};


