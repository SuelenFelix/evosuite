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

public class UserMusicDetail_getUser_4891759382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404612;

    public UserMusicDetail_getUser_4891759382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term404618 = new Long(-8735757853649335051L);
        term404612 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term404614 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term404616 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term404632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term404633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term404637 = newInstance(Class.forName("java.time.LocalTime"));
        Object term404642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term404643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term404647 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term404612, term404612.getClass(), "id", 2222570641313690254L);
        setLongField(term404614, term404614.getClass(), "id", -9086054091297879205L);
        setLongField(term404616, term404616.getClass(), "id", -4433155151923052669L);
        setField(term404616, term404616.getClass(), "extId", term404618);
        setField(term404616, term404616.getClass(), "luid", "ZcZUSLzTaq");
        setIntField(term404633, term404633.getClass(), "year", 2018);
        setShortField(term404633, term404633.getClass(), "month", (short) 3);
        setShortField(term404633, term404633.getClass(), "day", (short) 18);
        setField(term404632, term404632.getClass(), "date", term404633);
        setByteField(term404637, term404637.getClass(), "hour", (byte) 9);
        setByteField(term404637, term404637.getClass(), "minute", (byte) 6);
        setByteField(term404637, term404637.getClass(), "second", (byte) 2);
        setIntField(term404637, term404637.getClass(), "nano", 689374698);
        setField(term404632, term404632.getClass(), "time", term404637);
        setField(term404616, term404616.getClass(), "registerTime", term404632);
        setIntField(term404643, term404643.getClass(), "year", 2022);
        setShortField(term404643, term404643.getClass(), "month", (short) 4);
        setShortField(term404643, term404643.getClass(), "day", (short) 23);
        setField(term404642, term404642.getClass(), "date", term404643);
        setByteField(term404647, term404647.getClass(), "hour", (byte) 7);
        setByteField(term404647, term404647.getClass(), "minute", (byte) 9);
        setByteField(term404647, term404647.getClass(), "second", (byte) 27);
        setIntField(term404647, term404647.getClass(), "nano", 843142535);
        setField(term404642, term404642.getClass(), "time", term404647);
        setField(term404616, term404616.getClass(), "accessTime", term404642);
        setField(term404614, term404614.getClass(), "card", term404616);
        setField(term404614, term404614.getClass(), "userName", "nddLIGGfLi");
        setIntField(term404614, term404614.getClass(), "level", 880567745);
        setIntField(term404614, term404614.getClass(), "reincarnationNum", -1346676965);
        setLongField(term404614, term404614.getClass(), "exp", -7954999924936224754L);
        setLongField(term404614, term404614.getClass(), "point", 4857187962580249593L);
        setLongField(term404614, term404614.getClass(), "totalPoint", 6757940015527142269L);
        setIntField(term404614, term404614.getClass(), "playCount", 1259705856);
        setIntField(term404614, term404614.getClass(), "jewelCount", 1452423975);
        setIntField(term404614, term404614.getClass(), "totalJewelCount", 1013458888);
        setIntField(term404614, term404614.getClass(), "medalCount", 1689429271);
        setIntField(term404614, term404614.getClass(), "playerRating", 2047991596);
        setIntField(term404614, term404614.getClass(), "highestRating", 1675677853);
        setIntField(term404614, term404614.getClass(), "battlePoint", -296090934);
        setIntField(term404614, term404614.getClass(), "bestBattlePoint", -766011939);
        setIntField(term404614, term404614.getClass(), "overDamageBattlePoint", -1966904370);
        setBooleanField(term404614, term404614.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term404614, term404614.getClass(), "nameplateId", -1370886194);
        setIntField(term404614, term404614.getClass(), "trophyId", -658436910);
        setIntField(term404614, term404614.getClass(), "cardId", 301916186);
        setIntField(term404614, term404614.getClass(), "characterId", 1561472693);
        setIntField(term404614, term404614.getClass(), "characterVoiceNo", 1799665389);
        setIntField(term404614, term404614.getClass(), "tabSetting", -874279524);
        setIntField(term404614, term404614.getClass(), "tabSortSetting", 520318795);
        setIntField(term404614, term404614.getClass(), "cardCategorySetting", -430801479);
        setIntField(term404614, term404614.getClass(), "cardSortSetting", 1723606249);
        setIntField(term404614, term404614.getClass(), "rivalScoreCategorySetting", 1884462735);
        setIntField(term404614, term404614.getClass(), "playedTutorialBit", -727271773);
        setIntField(term404614, term404614.getClass(), "firstTutorialCancelNum", -160353078);
        setLongField(term404614, term404614.getClass(), "sumTechHighScore", 690252317501985157L);
        setLongField(term404614, term404614.getClass(), "sumTechBasicHighScore", -8602184519057287697L);
        setLongField(term404614, term404614.getClass(), "sumTechAdvancedHighScore", -8387724928136585335L);
        setLongField(term404614, term404614.getClass(), "sumTechExpertHighScore", 1746984970241024752L);
        setLongField(term404614, term404614.getClass(), "sumTechMasterHighScore", 6448299170686403509L);
        setLongField(term404614, term404614.getClass(), "sumTechLunaticHighScore", -6284262807090006153L);
        setLongField(term404614, term404614.getClass(), "sumBattleHighScore", -8541828392812849455L);
        setLongField(term404614, term404614.getClass(), "sumBattleBasicHighScore", -7061251528107788725L);
        setLongField(term404614, term404614.getClass(), "sumBattleAdvancedHighScore", -6167044481159278152L);
        setLongField(term404614, term404614.getClass(), "sumBattleExpertHighScore", 7057956815200870049L);
        setLongField(term404614, term404614.getClass(), "sumBattleMasterHighScore", -2696998534333526361L);
        setLongField(term404614, term404614.getClass(), "sumBattleLunaticHighScore", 3698167453738514698L);
        setField(term404614, term404614.getClass(), "eventWatchedDate", "HvUvAEqxmf");
        setField(term404614, term404614.getClass(), "cmEventWatchedDate", "ptnzSJwmOC");
        setField(term404614, term404614.getClass(), "firstGameId", "vPbdSlgAol");
        setField(term404614, term404614.getClass(), "firstRomVersion", "IkDlXUkxhZ");
        setField(term404614, term404614.getClass(), "firstDataVersion", "wkUKnhdVbh");
        setField(term404614, term404614.getClass(), "firstPlayDate", "afigzcCjPR");
        setField(term404614, term404614.getClass(), "lastGameId", "ToSmCxpOFw");
        setField(term404614, term404614.getClass(), "lastRomVersion", "iPuxTBWeqO");
        setField(term404614, term404614.getClass(), "lastDataVersion", "vvTPdZOGSa");
        setField(term404614, term404614.getClass(), "compatibleCmVersion", "rXyYYdcLGB");
        setField(term404614, term404614.getClass(), "lastPlayDate", "ndsXbLKWmm");
        setIntField(term404614, term404614.getClass(), "lastPlaceId", 1288569077);
        setField(term404614, term404614.getClass(), "lastPlaceName", "yfbJRyXDwX");
        setIntField(term404614, term404614.getClass(), "lastRegionId", 383997417);
        setField(term404614, term404614.getClass(), "lastRegionName", "xheMtRqkoq");
        setIntField(term404614, term404614.getClass(), "lastAllNetId", 1139330609);
        setField(term404614, term404614.getClass(), "lastClientId", "aJOoYvsshk");
        setIntField(term404614, term404614.getClass(), "lastUsedDeckId", 72775237);
        setIntField(term404614, term404614.getClass(), "lastPlayMusicLevel", -1911409084);
        setIntField(term404614, term404614.getClass(), "lastEmoneyBrand", -1741491908);
        setField(term404612, term404612.getClass(), "user", term404614);
        setIntField(term404612, term404612.getClass(), "musicId", 1474477634);
        setIntField(term404612, term404612.getClass(), "level", -2143052663);
        setIntField(term404612, term404612.getClass(), "playCount", -451565548);
        setIntField(term404612, term404612.getClass(), "techScoreMax", 1881060120);
        setIntField(term404612, term404612.getClass(), "techScoreRank", -1292919549);
        setIntField(term404612, term404612.getClass(), "battleScoreMax", 2049323210);
        setIntField(term404612, term404612.getClass(), "battleScoreRank", 350208494);
        setIntField(term404612, term404612.getClass(), "maxComboCount", -756062199);
        setIntField(term404612, term404612.getClass(), "maxOverKill", -191405461);
        setIntField(term404612, term404612.getClass(), "maxTeamOverKill", 1864563492);
        setBooleanField(term404612, term404612.getClass(), "isFullBell", true);
        setBooleanField(term404612, term404612.getClass(), "isFullCombo", false);
        setBooleanField(term404612, term404612.getClass(), "isAllBreake", true);
        setBooleanField(term404612, term404612.getClass(), "isLock", false);
        setIntField(term404612, term404612.getClass(), "clearStatus", -2012592085);
        setBooleanField(term404612, term404612.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term404612, args);
    }

};


