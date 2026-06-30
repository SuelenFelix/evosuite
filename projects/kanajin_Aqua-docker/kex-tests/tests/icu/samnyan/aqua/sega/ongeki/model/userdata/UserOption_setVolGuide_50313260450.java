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

public class UserOption_setVolGuide_50313260450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331992;
     Object term332294;

    public UserOption_setVolGuide_50313260450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331998 = new Long(-6481933642917183045L);
        term331992 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term331994 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term331996 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term332012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term332013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term332017 = newInstance(Class.forName("java.time.LocalTime"));
        Object term332022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term332023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term332027 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term331992, term331992.getClass(), "id", -6821458961283229048L);
        setLongField(term331994, term331994.getClass(), "id", -3974286520611432930L);
        setLongField(term331996, term331996.getClass(), "id", 5898876805434883657L);
        setField(term331996, term331996.getClass(), "extId", term331998);
        setField(term331996, term331996.getClass(), "luid", "wwxAjZuTkM");
        setIntField(term332013, term332013.getClass(), "year", 2019);
        setShortField(term332013, term332013.getClass(), "month", (short) 2);
        setShortField(term332013, term332013.getClass(), "day", (short) 13);
        setField(term332012, term332012.getClass(), "date", term332013);
        setByteField(term332017, term332017.getClass(), "hour", (byte) 13);
        setByteField(term332017, term332017.getClass(), "minute", (byte) 27);
        setByteField(term332017, term332017.getClass(), "second", (byte) 27);
        setIntField(term332017, term332017.getClass(), "nano", 331387415);
        setField(term332012, term332012.getClass(), "time", term332017);
        setField(term331996, term331996.getClass(), "registerTime", term332012);
        setIntField(term332023, term332023.getClass(), "year", 2017);
        setShortField(term332023, term332023.getClass(), "month", (short) 8);
        setShortField(term332023, term332023.getClass(), "day", (short) 7);
        setField(term332022, term332022.getClass(), "date", term332023);
        setByteField(term332027, term332027.getClass(), "hour", (byte) 23);
        setByteField(term332027, term332027.getClass(), "minute", (byte) 12);
        setByteField(term332027, term332027.getClass(), "second", (byte) 45);
        setIntField(term332027, term332027.getClass(), "nano", 36754495);
        setField(term332022, term332022.getClass(), "time", term332027);
        setField(term331996, term331996.getClass(), "accessTime", term332022);
        setField(term331994, term331994.getClass(), "card", term331996);
        setField(term331994, term331994.getClass(), "userName", "yDGHDtVOey");
        setIntField(term331994, term331994.getClass(), "level", -744920149);
        setIntField(term331994, term331994.getClass(), "reincarnationNum", 1235093000);
        setLongField(term331994, term331994.getClass(), "exp", 3491594540189440509L);
        setLongField(term331994, term331994.getClass(), "point", 8565260468311800180L);
        setLongField(term331994, term331994.getClass(), "totalPoint", 4122674469842582526L);
        setIntField(term331994, term331994.getClass(), "playCount", 1266939921);
        setIntField(term331994, term331994.getClass(), "jewelCount", -463524753);
        setIntField(term331994, term331994.getClass(), "totalJewelCount", 96421770);
        setIntField(term331994, term331994.getClass(), "medalCount", 1796357295);
        setIntField(term331994, term331994.getClass(), "playerRating", 1491595073);
        setIntField(term331994, term331994.getClass(), "highestRating", -944073646);
        setIntField(term331994, term331994.getClass(), "battlePoint", 1037283887);
        setIntField(term331994, term331994.getClass(), "bestBattlePoint", -124839616);
        setIntField(term331994, term331994.getClass(), "overDamageBattlePoint", -1114127619);
        setBooleanField(term331994, term331994.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term331994, term331994.getClass(), "nameplateId", -1864310048);
        setIntField(term331994, term331994.getClass(), "trophyId", -666341334);
        setIntField(term331994, term331994.getClass(), "cardId", 2143140424);
        setIntField(term331994, term331994.getClass(), "characterId", 1565278751);
        setIntField(term331994, term331994.getClass(), "characterVoiceNo", 853845004);
        setIntField(term331994, term331994.getClass(), "tabSetting", -906215646);
        setIntField(term331994, term331994.getClass(), "tabSortSetting", -895451788);
        setIntField(term331994, term331994.getClass(), "cardCategorySetting", -2034028726);
        setIntField(term331994, term331994.getClass(), "cardSortSetting", -2103279590);
        setIntField(term331994, term331994.getClass(), "rivalScoreCategorySetting", -1867257131);
        setIntField(term331994, term331994.getClass(), "playedTutorialBit", -474838461);
        setIntField(term331994, term331994.getClass(), "firstTutorialCancelNum", 29034390);
        setLongField(term331994, term331994.getClass(), "sumTechHighScore", -2271870381764118126L);
        setLongField(term331994, term331994.getClass(), "sumTechBasicHighScore", -6148690791010372642L);
        setLongField(term331994, term331994.getClass(), "sumTechAdvancedHighScore", -8902363232878166370L);
        setLongField(term331994, term331994.getClass(), "sumTechExpertHighScore", 697734892917822855L);
        setLongField(term331994, term331994.getClass(), "sumTechMasterHighScore", 7871896023724221964L);
        setLongField(term331994, term331994.getClass(), "sumTechLunaticHighScore", 7335889046858956217L);
        setLongField(term331994, term331994.getClass(), "sumBattleHighScore", -6616935990132514292L);
        setLongField(term331994, term331994.getClass(), "sumBattleBasicHighScore", -5152465364355275545L);
        setLongField(term331994, term331994.getClass(), "sumBattleAdvancedHighScore", -1958775414520291057L);
        setLongField(term331994, term331994.getClass(), "sumBattleExpertHighScore", 2286705106116820062L);
        setLongField(term331994, term331994.getClass(), "sumBattleMasterHighScore", -6479185152182474358L);
        setLongField(term331994, term331994.getClass(), "sumBattleLunaticHighScore", -8910615493360404052L);
        setField(term331994, term331994.getClass(), "eventWatchedDate", "uScvqFDBsu");
        setField(term331994, term331994.getClass(), "cmEventWatchedDate", "nIcutCdqrs");
        setField(term331994, term331994.getClass(), "firstGameId", "DNFLwGBmaU");
        setField(term331994, term331994.getClass(), "firstRomVersion", "PhmOsjbVxu");
        setField(term331994, term331994.getClass(), "firstDataVersion", "CBHMyYXigK");
        setField(term331994, term331994.getClass(), "firstPlayDate", "gzpGMGfmkG");
        setField(term331994, term331994.getClass(), "lastGameId", "eigMRgQUGY");
        setField(term331994, term331994.getClass(), "lastRomVersion", "dhLDTFuYTw");
        setField(term331994, term331994.getClass(), "lastDataVersion", "QSaeGjHBkv");
        setField(term331994, term331994.getClass(), "compatibleCmVersion", "SefixDLnGm");
        setField(term331994, term331994.getClass(), "lastPlayDate", "eoHgZnnUVY");
        setIntField(term331994, term331994.getClass(), "lastPlaceId", -1231280271);
        setField(term331994, term331994.getClass(), "lastPlaceName", "iRQWZXiEUH");
        setIntField(term331994, term331994.getClass(), "lastRegionId", -1834930596);
        setField(term331994, term331994.getClass(), "lastRegionName", "fcdVEOaHHw");
        setIntField(term331994, term331994.getClass(), "lastAllNetId", -1821846533);
        setField(term331994, term331994.getClass(), "lastClientId", "jUXTpaaeTB");
        setIntField(term331994, term331994.getClass(), "lastUsedDeckId", -879620237);
        setIntField(term331994, term331994.getClass(), "lastPlayMusicLevel", 913680308);
        setIntField(term331994, term331994.getClass(), "lastEmoneyBrand", -677386829);
        setField(term331992, term331992.getClass(), "user", term331994);
        setIntField(term331992, term331992.getClass(), "optionSet", 1466746592);
        setIntField(term331992, term331992.getClass(), "speed", -691091002);
        setIntField(term331992, term331992.getClass(), "mirror", -800424430);
        setIntField(term331992, term331992.getClass(), "judgeTiming", -363441287);
        setIntField(term331992, term331992.getClass(), "judgeAdjustment", -2068310877);
        setIntField(term331992, term331992.getClass(), "abort", -1651098280);
        setIntField(term331992, term331992.getClass(), "stealthField", 126941917);
        setIntField(term331992, term331992.getClass(), "tapSound", -554860813);
        setIntField(term331992, term331992.getClass(), "volGuide", -331590631);
        setIntField(term331992, term331992.getClass(), "volAll", 678866032);
        setIntField(term331992, term331992.getClass(), "volTap", -1650996647);
        setIntField(term331992, term331992.getClass(), "volCrTap", 887287382);
        setIntField(term331992, term331992.getClass(), "volHold", 490235948);
        setIntField(term331992, term331992.getClass(), "volSide", -2009881923);
        setIntField(term331992, term331992.getClass(), "volFlick", 1209186006);
        setIntField(term331992, term331992.getClass(), "volBell", 1237664069);
        setIntField(term331992, term331992.getClass(), "volEnemy", -1677139434);
        setIntField(term331992, term331992.getClass(), "volSkill", 78282106);
        setIntField(term331992, term331992.getClass(), "volDamage", -1276577791);
        setIntField(term331992, term331992.getClass(), "colorField", -540971112);
        setIntField(term331992, term331992.getClass(), "colorLaneBright", -413150517);
        setIntField(term331992, term331992.getClass(), "colorWallBright", 716493260);
        setIntField(term331992, term331992.getClass(), "colorLane", -221731978);
        setIntField(term331992, term331992.getClass(), "colorSide", 1560195166);
        setIntField(term331992, term331992.getClass(), "effectDamage", 1940111286);
        setIntField(term331992, term331992.getClass(), "effectPos", -782215827);
        setIntField(term331992, term331992.getClass(), "judgeDisp", -1641540968);
        setIntField(term331992, term331992.getClass(), "judgePos", -1406972635);
        setIntField(term331992, term331992.getClass(), "judgeBreak", 1409068712);
        setIntField(term331992, term331992.getClass(), "judgeHit", 1781149071);
        setIntField(term331992, term331992.getClass(), "platinumBreakDisp", -1147711067);
        setIntField(term331992, term331992.getClass(), "judgeCriticalBreak", 1530717560);
        setIntField(term331992, term331992.getClass(), "matching", -980321011);
        setIntField(term331992, term331992.getClass(), "dispPlayerLv", -496646150);
        setIntField(term331992, term331992.getClass(), "dispRating", -2117014524);
        setIntField(term331992, term331992.getClass(), "dispBP", -789911896);
        setIntField(term331992, term331992.getClass(), "headphone", 1525085792);
        term332294 = new Integer(-740973961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term332294;
        callMethod(klass, "setVolGuide", argTypes, term331992, args);
    }

};


