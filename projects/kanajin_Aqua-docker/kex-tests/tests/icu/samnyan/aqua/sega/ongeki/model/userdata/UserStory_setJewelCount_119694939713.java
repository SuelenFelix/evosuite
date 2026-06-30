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

public class UserStory_setJewelCount_119694939713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163658;
     Object term163929;

    public UserStory_setJewelCount_119694939713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term163664 = new Long(4458302820344896046L);
        term163658 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term163660 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term163662 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term163678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term163688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term163693 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term163658, term163658.getClass(), "id", -2426671262366817199L);
        setLongField(term163660, term163660.getClass(), "id", 2123521425879678249L);
        setLongField(term163662, term163662.getClass(), "id", -2134379872585283267L);
        setField(term163662, term163662.getClass(), "extId", term163664);
        setField(term163662, term163662.getClass(), "luid", "JXZfilbpmu");
        setIntField(term163679, term163679.getClass(), "year", 2014);
        setShortField(term163679, term163679.getClass(), "month", (short) 6);
        setShortField(term163679, term163679.getClass(), "day", (short) 12);
        setField(term163678, term163678.getClass(), "date", term163679);
        setByteField(term163683, term163683.getClass(), "hour", (byte) 2);
        setByteField(term163683, term163683.getClass(), "minute", (byte) 24);
        setByteField(term163683, term163683.getClass(), "second", (byte) 28);
        setIntField(term163683, term163683.getClass(), "nano", 77504831);
        setField(term163678, term163678.getClass(), "time", term163683);
        setField(term163662, term163662.getClass(), "registerTime", term163678);
        setIntField(term163689, term163689.getClass(), "year", 2028);
        setShortField(term163689, term163689.getClass(), "month", (short) 11);
        setShortField(term163689, term163689.getClass(), "day", (short) 18);
        setField(term163688, term163688.getClass(), "date", term163689);
        setByteField(term163693, term163693.getClass(), "hour", (byte) 18);
        setByteField(term163693, term163693.getClass(), "minute", (byte) 21);
        setByteField(term163693, term163693.getClass(), "second", (byte) 32);
        setIntField(term163693, term163693.getClass(), "nano", 483463169);
        setField(term163688, term163688.getClass(), "time", term163693);
        setField(term163662, term163662.getClass(), "accessTime", term163688);
        setField(term163660, term163660.getClass(), "card", term163662);
        setField(term163660, term163660.getClass(), "userName", "ZOCWqGoFBI");
        setIntField(term163660, term163660.getClass(), "level", 294062046);
        setIntField(term163660, term163660.getClass(), "reincarnationNum", 506380814);
        setLongField(term163660, term163660.getClass(), "exp", -3093522555278263065L);
        setLongField(term163660, term163660.getClass(), "point", 8815838186215527625L);
        setLongField(term163660, term163660.getClass(), "totalPoint", -6178872806819516827L);
        setIntField(term163660, term163660.getClass(), "playCount", 2141338064);
        setIntField(term163660, term163660.getClass(), "jewelCount", 1629871);
        setIntField(term163660, term163660.getClass(), "totalJewelCount", 745945402);
        setIntField(term163660, term163660.getClass(), "medalCount", 1563368376);
        setIntField(term163660, term163660.getClass(), "playerRating", -253159654);
        setIntField(term163660, term163660.getClass(), "highestRating", 1226284936);
        setIntField(term163660, term163660.getClass(), "battlePoint", 1372790052);
        setIntField(term163660, term163660.getClass(), "bestBattlePoint", -784035623);
        setIntField(term163660, term163660.getClass(), "overDamageBattlePoint", 1007848598);
        setBooleanField(term163660, term163660.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term163660, term163660.getClass(), "nameplateId", -1042332332);
        setIntField(term163660, term163660.getClass(), "trophyId", 752158731);
        setIntField(term163660, term163660.getClass(), "cardId", 941368721);
        setIntField(term163660, term163660.getClass(), "characterId", -1460524367);
        setIntField(term163660, term163660.getClass(), "characterVoiceNo", 947338447);
        setIntField(term163660, term163660.getClass(), "tabSetting", -1451763306);
        setIntField(term163660, term163660.getClass(), "tabSortSetting", -1644935195);
        setIntField(term163660, term163660.getClass(), "cardCategorySetting", 1161859055);
        setIntField(term163660, term163660.getClass(), "cardSortSetting", 1235637820);
        setIntField(term163660, term163660.getClass(), "rivalScoreCategorySetting", -120629892);
        setIntField(term163660, term163660.getClass(), "playedTutorialBit", -1054441261);
        setIntField(term163660, term163660.getClass(), "firstTutorialCancelNum", -1849440649);
        setLongField(term163660, term163660.getClass(), "sumTechHighScore", 3667519110548561757L);
        setLongField(term163660, term163660.getClass(), "sumTechBasicHighScore", 9085814143239936523L);
        setLongField(term163660, term163660.getClass(), "sumTechAdvancedHighScore", 3928385666356408907L);
        setLongField(term163660, term163660.getClass(), "sumTechExpertHighScore", -7493636961403038807L);
        setLongField(term163660, term163660.getClass(), "sumTechMasterHighScore", -5434014830409612713L);
        setLongField(term163660, term163660.getClass(), "sumTechLunaticHighScore", -3537882128376126825L);
        setLongField(term163660, term163660.getClass(), "sumBattleHighScore", -6054241362349257095L);
        setLongField(term163660, term163660.getClass(), "sumBattleBasicHighScore", 5442568919413262365L);
        setLongField(term163660, term163660.getClass(), "sumBattleAdvancedHighScore", 3549776544767502048L);
        setLongField(term163660, term163660.getClass(), "sumBattleExpertHighScore", -5880536871644887019L);
        setLongField(term163660, term163660.getClass(), "sumBattleMasterHighScore", 7984907992991522874L);
        setLongField(term163660, term163660.getClass(), "sumBattleLunaticHighScore", 9033564673534072783L);
        setField(term163660, term163660.getClass(), "eventWatchedDate", "jZceqvdJOm");
        setField(term163660, term163660.getClass(), "cmEventWatchedDate", "wMNDbrWUjd");
        setField(term163660, term163660.getClass(), "firstGameId", "VkZrLGHKUu");
        setField(term163660, term163660.getClass(), "firstRomVersion", "pFLsnHtjQL");
        setField(term163660, term163660.getClass(), "firstDataVersion", "QCZRKLJKNK");
        setField(term163660, term163660.getClass(), "firstPlayDate", "GhzRdsEUeK");
        setField(term163660, term163660.getClass(), "lastGameId", "EaDyXoCmvw");
        setField(term163660, term163660.getClass(), "lastRomVersion", "SnmEEcdVjr");
        setField(term163660, term163660.getClass(), "lastDataVersion", "spDbzLGljF");
        setField(term163660, term163660.getClass(), "compatibleCmVersion", "kKriCwCMKZ");
        setField(term163660, term163660.getClass(), "lastPlayDate", "OqqRKizGlA");
        setIntField(term163660, term163660.getClass(), "lastPlaceId", 215428761);
        setField(term163660, term163660.getClass(), "lastPlaceName", "BfkaSVewHo");
        setIntField(term163660, term163660.getClass(), "lastRegionId", 196912819);
        setField(term163660, term163660.getClass(), "lastRegionName", "GFeJRtCLPr");
        setIntField(term163660, term163660.getClass(), "lastAllNetId", -2106416475);
        setField(term163660, term163660.getClass(), "lastClientId", "peaLaAdtsN");
        setIntField(term163660, term163660.getClass(), "lastUsedDeckId", 1801549268);
        setIntField(term163660, term163660.getClass(), "lastPlayMusicLevel", -2109900781);
        setIntField(term163660, term163660.getClass(), "lastEmoneyBrand", 1524003020);
        setField(term163658, term163658.getClass(), "user", term163660);
        setIntField(term163658, term163658.getClass(), "storyId", 1117653130);
        setIntField(term163658, term163658.getClass(), "lastChapterId", -277091079);
        setIntField(term163658, term163658.getClass(), "jewelCount", 421713339);
        setIntField(term163658, term163658.getClass(), "lastPlayMusicId", -998894691);
        setIntField(term163658, term163658.getClass(), "lastPlayMusicCategory", -334578847);
        setIntField(term163658, term163658.getClass(), "lastPlayMusicLevel", -1048098682);
        term163929 = new Integer(-1887879558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term163929;
        callMethod(klass, "setJewelCount", argTypes, term163658, args);
    }

};


