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

public class UserOption_setJudgeHit_68459125571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341736;
     Object term342038;

    public UserOption_setJudgeHit_68459125571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term341742 = new Long(-6265886087280835813L);
        term341736 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term341738 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term341740 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term341756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term341757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term341761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term341766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term341767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term341771 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term341736, term341736.getClass(), "id", 2741525249187483989L);
        setLongField(term341738, term341738.getClass(), "id", 4357207668308298858L);
        setLongField(term341740, term341740.getClass(), "id", -3897996945904539361L);
        setField(term341740, term341740.getClass(), "extId", term341742);
        setField(term341740, term341740.getClass(), "luid", "OwHjOtkazz");
        setIntField(term341757, term341757.getClass(), "year", 2020);
        setShortField(term341757, term341757.getClass(), "month", (short) 4);
        setShortField(term341757, term341757.getClass(), "day", (short) 2);
        setField(term341756, term341756.getClass(), "date", term341757);
        setByteField(term341761, term341761.getClass(), "hour", (byte) 18);
        setByteField(term341761, term341761.getClass(), "minute", (byte) 6);
        setByteField(term341761, term341761.getClass(), "second", (byte) 10);
        setIntField(term341761, term341761.getClass(), "nano", 304440819);
        setField(term341756, term341756.getClass(), "time", term341761);
        setField(term341740, term341740.getClass(), "registerTime", term341756);
        setIntField(term341767, term341767.getClass(), "year", 2025);
        setShortField(term341767, term341767.getClass(), "month", (short) 2);
        setShortField(term341767, term341767.getClass(), "day", (short) 28);
        setField(term341766, term341766.getClass(), "date", term341767);
        setByteField(term341771, term341771.getClass(), "hour", (byte) 8);
        setByteField(term341771, term341771.getClass(), "minute", (byte) 39);
        setByteField(term341771, term341771.getClass(), "second", (byte) 58);
        setIntField(term341771, term341771.getClass(), "nano", 561438918);
        setField(term341766, term341766.getClass(), "time", term341771);
        setField(term341740, term341740.getClass(), "accessTime", term341766);
        setField(term341738, term341738.getClass(), "card", term341740);
        setField(term341738, term341738.getClass(), "userName", "TlLimWgkqq");
        setIntField(term341738, term341738.getClass(), "level", -1004351176);
        setIntField(term341738, term341738.getClass(), "reincarnationNum", 1262507064);
        setLongField(term341738, term341738.getClass(), "exp", 1162028453022120643L);
        setLongField(term341738, term341738.getClass(), "point", -5793340066852567543L);
        setLongField(term341738, term341738.getClass(), "totalPoint", 5858924096195912294L);
        setIntField(term341738, term341738.getClass(), "playCount", -158132375);
        setIntField(term341738, term341738.getClass(), "jewelCount", -775001515);
        setIntField(term341738, term341738.getClass(), "totalJewelCount", 2105634186);
        setIntField(term341738, term341738.getClass(), "medalCount", 32563099);
        setIntField(term341738, term341738.getClass(), "playerRating", -212150561);
        setIntField(term341738, term341738.getClass(), "highestRating", 1498974115);
        setIntField(term341738, term341738.getClass(), "battlePoint", -433258445);
        setIntField(term341738, term341738.getClass(), "bestBattlePoint", 406394605);
        setIntField(term341738, term341738.getClass(), "overDamageBattlePoint", -660475926);
        setBooleanField(term341738, term341738.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term341738, term341738.getClass(), "nameplateId", -1220602237);
        setIntField(term341738, term341738.getClass(), "trophyId", -626532898);
        setIntField(term341738, term341738.getClass(), "cardId", 345044952);
        setIntField(term341738, term341738.getClass(), "characterId", 572743759);
        setIntField(term341738, term341738.getClass(), "characterVoiceNo", -1828503387);
        setIntField(term341738, term341738.getClass(), "tabSetting", -1156493194);
        setIntField(term341738, term341738.getClass(), "tabSortSetting", -40832360);
        setIntField(term341738, term341738.getClass(), "cardCategorySetting", 1887903859);
        setIntField(term341738, term341738.getClass(), "cardSortSetting", -1702430458);
        setIntField(term341738, term341738.getClass(), "rivalScoreCategorySetting", 1128113590);
        setIntField(term341738, term341738.getClass(), "playedTutorialBit", -1044834555);
        setIntField(term341738, term341738.getClass(), "firstTutorialCancelNum", -1554913778);
        setLongField(term341738, term341738.getClass(), "sumTechHighScore", 3733441128052156040L);
        setLongField(term341738, term341738.getClass(), "sumTechBasicHighScore", 5295311055010995215L);
        setLongField(term341738, term341738.getClass(), "sumTechAdvancedHighScore", 6988808942966519540L);
        setLongField(term341738, term341738.getClass(), "sumTechExpertHighScore", 3837385574736209721L);
        setLongField(term341738, term341738.getClass(), "sumTechMasterHighScore", -22295165482606634L);
        setLongField(term341738, term341738.getClass(), "sumTechLunaticHighScore", 1938103213174893576L);
        setLongField(term341738, term341738.getClass(), "sumBattleHighScore", -453418269355527066L);
        setLongField(term341738, term341738.getClass(), "sumBattleBasicHighScore", 1583550576016684905L);
        setLongField(term341738, term341738.getClass(), "sumBattleAdvancedHighScore", 1429263409338582350L);
        setLongField(term341738, term341738.getClass(), "sumBattleExpertHighScore", -8494319049715264137L);
        setLongField(term341738, term341738.getClass(), "sumBattleMasterHighScore", 4084590262277839796L);
        setLongField(term341738, term341738.getClass(), "sumBattleLunaticHighScore", -4809180902002774496L);
        setField(term341738, term341738.getClass(), "eventWatchedDate", "mpxDXNArDx");
        setField(term341738, term341738.getClass(), "cmEventWatchedDate", "QwRtjtCdnn");
        setField(term341738, term341738.getClass(), "firstGameId", "dnkOXyIzVS");
        setField(term341738, term341738.getClass(), "firstRomVersion", "lWhCChGXGz");
        setField(term341738, term341738.getClass(), "firstDataVersion", "VGmnxpKtew");
        setField(term341738, term341738.getClass(), "firstPlayDate", "AjiIEGMVcQ");
        setField(term341738, term341738.getClass(), "lastGameId", "bkoaTUDELz");
        setField(term341738, term341738.getClass(), "lastRomVersion", "WgWJhcAUjv");
        setField(term341738, term341738.getClass(), "lastDataVersion", "WHpWiswBzG");
        setField(term341738, term341738.getClass(), "compatibleCmVersion", "iVUkYPLQqr");
        setField(term341738, term341738.getClass(), "lastPlayDate", "MQzagfTmJi");
        setIntField(term341738, term341738.getClass(), "lastPlaceId", -1946117481);
        setField(term341738, term341738.getClass(), "lastPlaceName", "uLgtTvWUTo");
        setIntField(term341738, term341738.getClass(), "lastRegionId", 522720000);
        setField(term341738, term341738.getClass(), "lastRegionName", "nWyiNxEMeu");
        setIntField(term341738, term341738.getClass(), "lastAllNetId", -1643147824);
        setField(term341738, term341738.getClass(), "lastClientId", "sjPYZSJwhG");
        setIntField(term341738, term341738.getClass(), "lastUsedDeckId", -1375609313);
        setIntField(term341738, term341738.getClass(), "lastPlayMusicLevel", -952677092);
        setIntField(term341738, term341738.getClass(), "lastEmoneyBrand", -1099005330);
        setField(term341736, term341736.getClass(), "user", term341738);
        setIntField(term341736, term341736.getClass(), "optionSet", 827777548);
        setIntField(term341736, term341736.getClass(), "speed", -907505121);
        setIntField(term341736, term341736.getClass(), "mirror", -1356442537);
        setIntField(term341736, term341736.getClass(), "judgeTiming", -847995610);
        setIntField(term341736, term341736.getClass(), "judgeAdjustment", -425664784);
        setIntField(term341736, term341736.getClass(), "abort", 849439865);
        setIntField(term341736, term341736.getClass(), "stealthField", 375631205);
        setIntField(term341736, term341736.getClass(), "tapSound", 1577887474);
        setIntField(term341736, term341736.getClass(), "volGuide", -1022687781);
        setIntField(term341736, term341736.getClass(), "volAll", 1426559032);
        setIntField(term341736, term341736.getClass(), "volTap", 260611687);
        setIntField(term341736, term341736.getClass(), "volCrTap", 953810704);
        setIntField(term341736, term341736.getClass(), "volHold", 599646359);
        setIntField(term341736, term341736.getClass(), "volSide", -410716158);
        setIntField(term341736, term341736.getClass(), "volFlick", 2107710563);
        setIntField(term341736, term341736.getClass(), "volBell", 405428805);
        setIntField(term341736, term341736.getClass(), "volEnemy", -619138079);
        setIntField(term341736, term341736.getClass(), "volSkill", -1581248444);
        setIntField(term341736, term341736.getClass(), "volDamage", -2121192595);
        setIntField(term341736, term341736.getClass(), "colorField", 700451384);
        setIntField(term341736, term341736.getClass(), "colorLaneBright", 1653036585);
        setIntField(term341736, term341736.getClass(), "colorWallBright", -2008268626);
        setIntField(term341736, term341736.getClass(), "colorLane", -1632789247);
        setIntField(term341736, term341736.getClass(), "colorSide", 454616572);
        setIntField(term341736, term341736.getClass(), "effectDamage", -1978126699);
        setIntField(term341736, term341736.getClass(), "effectPos", 39131361);
        setIntField(term341736, term341736.getClass(), "judgeDisp", 213373107);
        setIntField(term341736, term341736.getClass(), "judgePos", -1923090);
        setIntField(term341736, term341736.getClass(), "judgeBreak", 2076483659);
        setIntField(term341736, term341736.getClass(), "judgeHit", 713233511);
        setIntField(term341736, term341736.getClass(), "platinumBreakDisp", -297641207);
        setIntField(term341736, term341736.getClass(), "judgeCriticalBreak", 2062996672);
        setIntField(term341736, term341736.getClass(), "matching", -557947409);
        setIntField(term341736, term341736.getClass(), "dispPlayerLv", 752101859);
        setIntField(term341736, term341736.getClass(), "dispRating", -226576729);
        setIntField(term341736, term341736.getClass(), "dispBP", -179994666);
        setIntField(term341736, term341736.getClass(), "headphone", -80174742);
        term342038 = new Integer(-1475241591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term342038;
        callMethod(klass, "setJudgeHit", argTypes, term341736, args);
    }

};


