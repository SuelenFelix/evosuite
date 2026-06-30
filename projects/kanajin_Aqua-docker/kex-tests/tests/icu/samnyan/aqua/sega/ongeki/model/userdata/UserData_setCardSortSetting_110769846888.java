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

public class UserData_setCardSortSetting_110769846888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59258;
     Object term59521;

    public UserData_setCardSortSetting_110769846888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59262 = new Long(8802866251294305945L);
        term59258 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term59260 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59291 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59258, term59258.getClass(), "id", -575552490673780150L);
        setLongField(term59260, term59260.getClass(), "id", -923885290718800192L);
        setField(term59260, term59260.getClass(), "extId", term59262);
        setField(term59260, term59260.getClass(), "luid", "FDzNpfjYDI");
        setIntField(term59277, term59277.getClass(), "year", 2017);
        setShortField(term59277, term59277.getClass(), "month", (short) 2);
        setShortField(term59277, term59277.getClass(), "day", (short) 5);
        setField(term59276, term59276.getClass(), "date", term59277);
        setByteField(term59281, term59281.getClass(), "hour", (byte) 5);
        setByteField(term59281, term59281.getClass(), "minute", (byte) 46);
        setByteField(term59281, term59281.getClass(), "second", (byte) 38);
        setIntField(term59281, term59281.getClass(), "nano", 214202896);
        setField(term59276, term59276.getClass(), "time", term59281);
        setField(term59260, term59260.getClass(), "registerTime", term59276);
        setIntField(term59287, term59287.getClass(), "year", 2025);
        setShortField(term59287, term59287.getClass(), "month", (short) 6);
        setShortField(term59287, term59287.getClass(), "day", (short) 18);
        setField(term59286, term59286.getClass(), "date", term59287);
        setByteField(term59291, term59291.getClass(), "hour", (byte) 14);
        setByteField(term59291, term59291.getClass(), "minute", (byte) 17);
        setByteField(term59291, term59291.getClass(), "second", (byte) 34);
        setIntField(term59291, term59291.getClass(), "nano", 564527758);
        setField(term59286, term59286.getClass(), "time", term59291);
        setField(term59260, term59260.getClass(), "accessTime", term59286);
        setField(term59258, term59258.getClass(), "card", term59260);
        setField(term59258, term59258.getClass(), "userName", "vSbbcByIuA");
        setIntField(term59258, term59258.getClass(), "level", 324766253);
        setIntField(term59258, term59258.getClass(), "reincarnationNum", -1128978986);
        setLongField(term59258, term59258.getClass(), "exp", -7721155272042062465L);
        setLongField(term59258, term59258.getClass(), "point", -3609905362646270267L);
        setLongField(term59258, term59258.getClass(), "totalPoint", -2000451137378760129L);
        setIntField(term59258, term59258.getClass(), "playCount", 192962115);
        setIntField(term59258, term59258.getClass(), "jewelCount", 1531205463);
        setIntField(term59258, term59258.getClass(), "totalJewelCount", 586115489);
        setIntField(term59258, term59258.getClass(), "medalCount", 1377331021);
        setIntField(term59258, term59258.getClass(), "playerRating", 1915536131);
        setIntField(term59258, term59258.getClass(), "highestRating", 936561631);
        setIntField(term59258, term59258.getClass(), "battlePoint", -160474197);
        setIntField(term59258, term59258.getClass(), "bestBattlePoint", 279768924);
        setIntField(term59258, term59258.getClass(), "overDamageBattlePoint", 1949719112);
        setBooleanField(term59258, term59258.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term59258, term59258.getClass(), "nameplateId", 203059697);
        setIntField(term59258, term59258.getClass(), "trophyId", 260352378);
        setIntField(term59258, term59258.getClass(), "cardId", -1344061485);
        setIntField(term59258, term59258.getClass(), "characterId", -13926283);
        setIntField(term59258, term59258.getClass(), "characterVoiceNo", -1240452164);
        setIntField(term59258, term59258.getClass(), "tabSetting", 501130109);
        setIntField(term59258, term59258.getClass(), "tabSortSetting", -1307655183);
        setIntField(term59258, term59258.getClass(), "cardCategorySetting", 1309934432);
        setIntField(term59258, term59258.getClass(), "cardSortSetting", 909183017);
        setIntField(term59258, term59258.getClass(), "rivalScoreCategorySetting", -2115858923);
        setIntField(term59258, term59258.getClass(), "playedTutorialBit", 1709658376);
        setIntField(term59258, term59258.getClass(), "firstTutorialCancelNum", -1235730396);
        setLongField(term59258, term59258.getClass(), "sumTechHighScore", 1101988351761375103L);
        setLongField(term59258, term59258.getClass(), "sumTechBasicHighScore", 3578367247532414586L);
        setLongField(term59258, term59258.getClass(), "sumTechAdvancedHighScore", -2559231705850769990L);
        setLongField(term59258, term59258.getClass(), "sumTechExpertHighScore", -1061715269956397020L);
        setLongField(term59258, term59258.getClass(), "sumTechMasterHighScore", -8348777841777993085L);
        setLongField(term59258, term59258.getClass(), "sumTechLunaticHighScore", 3281687079413025082L);
        setLongField(term59258, term59258.getClass(), "sumBattleHighScore", -3122487376211578679L);
        setLongField(term59258, term59258.getClass(), "sumBattleBasicHighScore", 6613572652484057095L);
        setLongField(term59258, term59258.getClass(), "sumBattleAdvancedHighScore", 5215884227381487937L);
        setLongField(term59258, term59258.getClass(), "sumBattleExpertHighScore", 4350818387294517155L);
        setLongField(term59258, term59258.getClass(), "sumBattleMasterHighScore", 7828337678482028682L);
        setLongField(term59258, term59258.getClass(), "sumBattleLunaticHighScore", 5807310433343059132L);
        setField(term59258, term59258.getClass(), "eventWatchedDate", "QSvdWzkkPx");
        setField(term59258, term59258.getClass(), "cmEventWatchedDate", "vStdEtWvae");
        setField(term59258, term59258.getClass(), "firstGameId", "iApJWgnQkP");
        setField(term59258, term59258.getClass(), "firstRomVersion", "kHKzzYJxiP");
        setField(term59258, term59258.getClass(), "firstDataVersion", "INFnBrMIka");
        setField(term59258, term59258.getClass(), "firstPlayDate", "EwmpEgdvZs");
        setField(term59258, term59258.getClass(), "lastGameId", "vRjHouXWLC");
        setField(term59258, term59258.getClass(), "lastRomVersion", "XghDInkWEe");
        setField(term59258, term59258.getClass(), "lastDataVersion", "zPDuGbsYGT");
        setField(term59258, term59258.getClass(), "compatibleCmVersion", "apnNoBOovC");
        setField(term59258, term59258.getClass(), "lastPlayDate", "SyGIHWAumE");
        setIntField(term59258, term59258.getClass(), "lastPlaceId", -366600678);
        setField(term59258, term59258.getClass(), "lastPlaceName", "bMQUwQqyMc");
        setIntField(term59258, term59258.getClass(), "lastRegionId", -1641994868);
        setField(term59258, term59258.getClass(), "lastRegionName", "CVaGhXmAUN");
        setIntField(term59258, term59258.getClass(), "lastAllNetId", 1729072481);
        setField(term59258, term59258.getClass(), "lastClientId", "KnclcuNYRb");
        setIntField(term59258, term59258.getClass(), "lastUsedDeckId", -1281635786);
        setIntField(term59258, term59258.getClass(), "lastPlayMusicLevel", 1768552438);
        setIntField(term59258, term59258.getClass(), "lastEmoneyBrand", -166990524);
        term59521 = new Integer(-1302306468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59521;
        callMethod(klass, "setCardSortSetting", argTypes, term59258, args);
    }

};


