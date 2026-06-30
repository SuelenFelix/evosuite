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
import java.lang.Integer;

public class UserMusicDetail_setTechScoreRank_7092821225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415188;
     Object term415469;

    public UserMusicDetail_setTechScoreRank_7092821225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term415194 = new Long(7314774835988078404L);
        term415188 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term415190 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term415192 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term415208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term415209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term415213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term415218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term415219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term415223 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term415188, term415188.getClass(), "id", -1976021882680553725L);
        setLongField(term415190, term415190.getClass(), "id", -8606154815469377122L);
        setLongField(term415192, term415192.getClass(), "id", 1088812225808780481L);
        setField(term415192, term415192.getClass(), "extId", term415194);
        setField(term415192, term415192.getClass(), "luid", "IwNyJuOIsz");
        setIntField(term415209, term415209.getClass(), "year", 2016);
        setShortField(term415209, term415209.getClass(), "month", (short) 3);
        setShortField(term415209, term415209.getClass(), "day", (short) 14);
        setField(term415208, term415208.getClass(), "date", term415209);
        setByteField(term415213, term415213.getClass(), "hour", (byte) 18);
        setByteField(term415213, term415213.getClass(), "minute", (byte) 35);
        setByteField(term415213, term415213.getClass(), "second", (byte) 21);
        setIntField(term415213, term415213.getClass(), "nano", 363249410);
        setField(term415208, term415208.getClass(), "time", term415213);
        setField(term415192, term415192.getClass(), "registerTime", term415208);
        setIntField(term415219, term415219.getClass(), "year", 2024);
        setShortField(term415219, term415219.getClass(), "month", (short) 4);
        setShortField(term415219, term415219.getClass(), "day", (short) 10);
        setField(term415218, term415218.getClass(), "date", term415219);
        setByteField(term415223, term415223.getClass(), "hour", (byte) 0);
        setByteField(term415223, term415223.getClass(), "minute", (byte) 37);
        setByteField(term415223, term415223.getClass(), "second", (byte) 26);
        setIntField(term415223, term415223.getClass(), "nano", 518241770);
        setField(term415218, term415218.getClass(), "time", term415223);
        setField(term415192, term415192.getClass(), "accessTime", term415218);
        setField(term415190, term415190.getClass(), "card", term415192);
        setField(term415190, term415190.getClass(), "userName", "CXzrFFOZEi");
        setIntField(term415190, term415190.getClass(), "level", -988285762);
        setIntField(term415190, term415190.getClass(), "reincarnationNum", -615298749);
        setLongField(term415190, term415190.getClass(), "exp", 7757465935334495261L);
        setLongField(term415190, term415190.getClass(), "point", -2351730433835144454L);
        setLongField(term415190, term415190.getClass(), "totalPoint", -1669307472214251785L);
        setIntField(term415190, term415190.getClass(), "playCount", 1705583034);
        setIntField(term415190, term415190.getClass(), "jewelCount", 1316213330);
        setIntField(term415190, term415190.getClass(), "totalJewelCount", 625074801);
        setIntField(term415190, term415190.getClass(), "medalCount", 1994332396);
        setIntField(term415190, term415190.getClass(), "playerRating", -1542343028);
        setIntField(term415190, term415190.getClass(), "highestRating", 1043055268);
        setIntField(term415190, term415190.getClass(), "battlePoint", 1493955591);
        setIntField(term415190, term415190.getClass(), "bestBattlePoint", 2026508915);
        setIntField(term415190, term415190.getClass(), "overDamageBattlePoint", -1134840573);
        setBooleanField(term415190, term415190.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term415190, term415190.getClass(), "nameplateId", -328630112);
        setIntField(term415190, term415190.getClass(), "trophyId", 1165385454);
        setIntField(term415190, term415190.getClass(), "cardId", 1914619623);
        setIntField(term415190, term415190.getClass(), "characterId", 530111617);
        setIntField(term415190, term415190.getClass(), "characterVoiceNo", -1075535298);
        setIntField(term415190, term415190.getClass(), "tabSetting", 979633696);
        setIntField(term415190, term415190.getClass(), "tabSortSetting", 1028186292);
        setIntField(term415190, term415190.getClass(), "cardCategorySetting", 963870880);
        setIntField(term415190, term415190.getClass(), "cardSortSetting", 387828020);
        setIntField(term415190, term415190.getClass(), "rivalScoreCategorySetting", -1766940540);
        setIntField(term415190, term415190.getClass(), "playedTutorialBit", 290935864);
        setIntField(term415190, term415190.getClass(), "firstTutorialCancelNum", 997339182);
        setLongField(term415190, term415190.getClass(), "sumTechHighScore", 8524174650628374119L);
        setLongField(term415190, term415190.getClass(), "sumTechBasicHighScore", 4653119581941281032L);
        setLongField(term415190, term415190.getClass(), "sumTechAdvancedHighScore", -2251542083150037521L);
        setLongField(term415190, term415190.getClass(), "sumTechExpertHighScore", 5302768063546589141L);
        setLongField(term415190, term415190.getClass(), "sumTechMasterHighScore", -2933981507584372437L);
        setLongField(term415190, term415190.getClass(), "sumTechLunaticHighScore", -5468173303798121559L);
        setLongField(term415190, term415190.getClass(), "sumBattleHighScore", 2438859452713878310L);
        setLongField(term415190, term415190.getClass(), "sumBattleBasicHighScore", 5679728958712275456L);
        setLongField(term415190, term415190.getClass(), "sumBattleAdvancedHighScore", -5787298206228816540L);
        setLongField(term415190, term415190.getClass(), "sumBattleExpertHighScore", 5082235648118407721L);
        setLongField(term415190, term415190.getClass(), "sumBattleMasterHighScore", 8648899582255345445L);
        setLongField(term415190, term415190.getClass(), "sumBattleLunaticHighScore", 2004776715503378470L);
        setField(term415190, term415190.getClass(), "eventWatchedDate", "uGlqwweEYb");
        setField(term415190, term415190.getClass(), "cmEventWatchedDate", "RfdTbdOZCc");
        setField(term415190, term415190.getClass(), "firstGameId", "cMrhLIOtDC");
        setField(term415190, term415190.getClass(), "firstRomVersion", "ORZQZamlCa");
        setField(term415190, term415190.getClass(), "firstDataVersion", "sAAKDMqHcv");
        setField(term415190, term415190.getClass(), "firstPlayDate", "rDGZoVdPmQ");
        setField(term415190, term415190.getClass(), "lastGameId", "wNQBSYwZyr");
        setField(term415190, term415190.getClass(), "lastRomVersion", "vCZwMzIthy");
        setField(term415190, term415190.getClass(), "lastDataVersion", "LqhxEGgJpB");
        setField(term415190, term415190.getClass(), "compatibleCmVersion", "zXedryDBCG");
        setField(term415190, term415190.getClass(), "lastPlayDate", "CMvzFGwZrh");
        setIntField(term415190, term415190.getClass(), "lastPlaceId", 199907244);
        setField(term415190, term415190.getClass(), "lastPlaceName", "tQajztYoDg");
        setIntField(term415190, term415190.getClass(), "lastRegionId", 1022124436);
        setField(term415190, term415190.getClass(), "lastRegionName", "qkqyQWuuek");
        setIntField(term415190, term415190.getClass(), "lastAllNetId", 2128119189);
        setField(term415190, term415190.getClass(), "lastClientId", "rLUqflArLd");
        setIntField(term415190, term415190.getClass(), "lastUsedDeckId", 1210075256);
        setIntField(term415190, term415190.getClass(), "lastPlayMusicLevel", 45759543);
        setIntField(term415190, term415190.getClass(), "lastEmoneyBrand", -430634945);
        setField(term415188, term415188.getClass(), "user", term415190);
        setIntField(term415188, term415188.getClass(), "musicId", -118327352);
        setIntField(term415188, term415188.getClass(), "level", 1259731147);
        setIntField(term415188, term415188.getClass(), "playCount", -1898313472);
        setIntField(term415188, term415188.getClass(), "techScoreMax", 799963152);
        setIntField(term415188, term415188.getClass(), "techScoreRank", 1290164474);
        setIntField(term415188, term415188.getClass(), "battleScoreMax", 1098807863);
        setIntField(term415188, term415188.getClass(), "battleScoreRank", 1247988292);
        setIntField(term415188, term415188.getClass(), "maxComboCount", 1342652558);
        setIntField(term415188, term415188.getClass(), "maxOverKill", -1924136938);
        setIntField(term415188, term415188.getClass(), "maxTeamOverKill", -1956413546);
        setBooleanField(term415188, term415188.getClass(), "isFullBell", true);
        setBooleanField(term415188, term415188.getClass(), "isFullCombo", true);
        setBooleanField(term415188, term415188.getClass(), "isAllBreake", true);
        setBooleanField(term415188, term415188.getClass(), "isLock", false);
        setIntField(term415188, term415188.getClass(), "clearStatus", -173256703);
        setBooleanField(term415188, term415188.getClass(), "isStoryWatched", false);
        term415469 = new Integer(881309414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term415469;
        callMethod(klass, "setTechScoreRank", argTypes, term415188, args);
    }

};


