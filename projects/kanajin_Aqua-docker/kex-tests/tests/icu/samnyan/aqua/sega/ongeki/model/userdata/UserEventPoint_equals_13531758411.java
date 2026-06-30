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

public class UserEventPoint_equals_13531758411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386680;
     Object term386948;

    public UserEventPoint_equals_13531758411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term386686 = new Long(4337555582321907177L);
        term386680 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term386682 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term386684 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term386700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term386701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term386705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term386710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term386711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term386715 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term386680, term386680.getClass(), "id", -6315595965009050635L);
        setLongField(term386682, term386682.getClass(), "id", 6719324164495452131L);
        setLongField(term386684, term386684.getClass(), "id", 2604104733488315088L);
        setField(term386684, term386684.getClass(), "extId", term386686);
        setField(term386684, term386684.getClass(), "luid", "sWGVxEcdYq");
        setIntField(term386701, term386701.getClass(), "year", 2025);
        setShortField(term386701, term386701.getClass(), "month", (short) 11);
        setShortField(term386701, term386701.getClass(), "day", (short) 23);
        setField(term386700, term386700.getClass(), "date", term386701);
        setByteField(term386705, term386705.getClass(), "hour", (byte) 21);
        setByteField(term386705, term386705.getClass(), "minute", (byte) 5);
        setByteField(term386705, term386705.getClass(), "second", (byte) 32);
        setIntField(term386705, term386705.getClass(), "nano", 194920811);
        setField(term386700, term386700.getClass(), "time", term386705);
        setField(term386684, term386684.getClass(), "registerTime", term386700);
        setIntField(term386711, term386711.getClass(), "year", 2023);
        setShortField(term386711, term386711.getClass(), "month", (short) 8);
        setShortField(term386711, term386711.getClass(), "day", (short) 14);
        setField(term386710, term386710.getClass(), "date", term386711);
        setByteField(term386715, term386715.getClass(), "hour", (byte) 0);
        setByteField(term386715, term386715.getClass(), "minute", (byte) 21);
        setByteField(term386715, term386715.getClass(), "second", (byte) 6);
        setIntField(term386715, term386715.getClass(), "nano", 18253801);
        setField(term386710, term386710.getClass(), "time", term386715);
        setField(term386684, term386684.getClass(), "accessTime", term386710);
        setField(term386682, term386682.getClass(), "card", term386684);
        setField(term386682, term386682.getClass(), "userName", "OnOTXAlhTr");
        setIntField(term386682, term386682.getClass(), "level", 386814449);
        setIntField(term386682, term386682.getClass(), "reincarnationNum", -610134446);
        setLongField(term386682, term386682.getClass(), "exp", 7099623057567205947L);
        setLongField(term386682, term386682.getClass(), "point", 1176969316993993896L);
        setLongField(term386682, term386682.getClass(), "totalPoint", 1035296732415683145L);
        setIntField(term386682, term386682.getClass(), "playCount", 1878530216);
        setIntField(term386682, term386682.getClass(), "jewelCount", 1313873072);
        setIntField(term386682, term386682.getClass(), "totalJewelCount", -106124260);
        setIntField(term386682, term386682.getClass(), "medalCount", 1573687876);
        setIntField(term386682, term386682.getClass(), "playerRating", 368253656);
        setIntField(term386682, term386682.getClass(), "highestRating", -783654943);
        setIntField(term386682, term386682.getClass(), "battlePoint", 868284150);
        setIntField(term386682, term386682.getClass(), "bestBattlePoint", -1186285603);
        setIntField(term386682, term386682.getClass(), "overDamageBattlePoint", 147777573);
        setBooleanField(term386682, term386682.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term386682, term386682.getClass(), "nameplateId", 1605341222);
        setIntField(term386682, term386682.getClass(), "trophyId", -253186515);
        setIntField(term386682, term386682.getClass(), "cardId", -1068465416);
        setIntField(term386682, term386682.getClass(), "characterId", -815563768);
        setIntField(term386682, term386682.getClass(), "characterVoiceNo", -949087847);
        setIntField(term386682, term386682.getClass(), "tabSetting", 715400904);
        setIntField(term386682, term386682.getClass(), "tabSortSetting", 2140108491);
        setIntField(term386682, term386682.getClass(), "cardCategorySetting", -364279579);
        setIntField(term386682, term386682.getClass(), "cardSortSetting", -233680170);
        setIntField(term386682, term386682.getClass(), "rivalScoreCategorySetting", 1000079776);
        setIntField(term386682, term386682.getClass(), "playedTutorialBit", 1921814860);
        setIntField(term386682, term386682.getClass(), "firstTutorialCancelNum", 1833890211);
        setLongField(term386682, term386682.getClass(), "sumTechHighScore", -628119139515998489L);
        setLongField(term386682, term386682.getClass(), "sumTechBasicHighScore", 1287443605477317328L);
        setLongField(term386682, term386682.getClass(), "sumTechAdvancedHighScore", -8239993785647235304L);
        setLongField(term386682, term386682.getClass(), "sumTechExpertHighScore", -2953338764638285447L);
        setLongField(term386682, term386682.getClass(), "sumTechMasterHighScore", -7856125163440808312L);
        setLongField(term386682, term386682.getClass(), "sumTechLunaticHighScore", 5806981157428135198L);
        setLongField(term386682, term386682.getClass(), "sumBattleHighScore", -1541923049095584726L);
        setLongField(term386682, term386682.getClass(), "sumBattleBasicHighScore", -2710143262682928059L);
        setLongField(term386682, term386682.getClass(), "sumBattleAdvancedHighScore", 4666214878971934907L);
        setLongField(term386682, term386682.getClass(), "sumBattleExpertHighScore", -2506778424111112214L);
        setLongField(term386682, term386682.getClass(), "sumBattleMasterHighScore", 5773169127751119141L);
        setLongField(term386682, term386682.getClass(), "sumBattleLunaticHighScore", -8537597400716663167L);
        setField(term386682, term386682.getClass(), "eventWatchedDate", "ZXTHriZTSG");
        setField(term386682, term386682.getClass(), "cmEventWatchedDate", "ppbalusRSD");
        setField(term386682, term386682.getClass(), "firstGameId", "FJlCFmKpAl");
        setField(term386682, term386682.getClass(), "firstRomVersion", "LlWPFEzlzT");
        setField(term386682, term386682.getClass(), "firstDataVersion", "tlXOgyDhEq");
        setField(term386682, term386682.getClass(), "firstPlayDate", "NoGwsNpmHa");
        setField(term386682, term386682.getClass(), "lastGameId", "sSkLdZmtkd");
        setField(term386682, term386682.getClass(), "lastRomVersion", "jdnXpYDVzj");
        setField(term386682, term386682.getClass(), "lastDataVersion", "EitMZwKraX");
        setField(term386682, term386682.getClass(), "compatibleCmVersion", "TcnvMZMwRA");
        setField(term386682, term386682.getClass(), "lastPlayDate", "HsAkZzjpgu");
        setIntField(term386682, term386682.getClass(), "lastPlaceId", 1292470529);
        setField(term386682, term386682.getClass(), "lastPlaceName", "OPCdSqEbzk");
        setIntField(term386682, term386682.getClass(), "lastRegionId", 78041358);
        setField(term386682, term386682.getClass(), "lastRegionName", "qYQsXCaYpZ");
        setIntField(term386682, term386682.getClass(), "lastAllNetId", 869765327);
        setField(term386682, term386682.getClass(), "lastClientId", "IjPIKkHWsb");
        setIntField(term386682, term386682.getClass(), "lastUsedDeckId", 448841855);
        setIntField(term386682, term386682.getClass(), "lastPlayMusicLevel", -1501190130);
        setIntField(term386682, term386682.getClass(), "lastEmoneyBrand", -1583946267);
        setField(term386680, term386680.getClass(), "user", term386682);
        setIntField(term386680, term386680.getClass(), "eventId", -406949901);
        setLongField(term386680, term386680.getClass(), "point", -348823114514334936L);
        setBooleanField(term386680, term386680.getClass(), "isRankingRewarded", false);
        term386948 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term386948;
        callMethod(klass, "equals", argTypes, term386680, args);
    }

};


