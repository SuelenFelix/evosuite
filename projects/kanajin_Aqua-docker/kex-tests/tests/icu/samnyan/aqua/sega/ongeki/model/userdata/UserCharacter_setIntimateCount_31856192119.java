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

public class UserCharacter_setIntimateCount_31856192119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176789;
     Object term177074;

    public UserCharacter_setIntimateCount_31856192119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term176795 = new Long(-3806202176947356197L);
        term176789 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term176791 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term176793 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term176809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term176810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term176814 = newInstance(Class.forName("java.time.LocalTime"));
        Object term176819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term176820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term176824 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term176789, term176789.getClass(), "id", 8946410365493398032L);
        setLongField(term176791, term176791.getClass(), "id", 7968389197388339392L);
        setLongField(term176793, term176793.getClass(), "id", 7481016473114257898L);
        setField(term176793, term176793.getClass(), "extId", term176795);
        setField(term176793, term176793.getClass(), "luid", "AqjHcNbvNU");
        setIntField(term176810, term176810.getClass(), "year", 2017);
        setShortField(term176810, term176810.getClass(), "month", (short) 4);
        setShortField(term176810, term176810.getClass(), "day", (short) 7);
        setField(term176809, term176809.getClass(), "date", term176810);
        setByteField(term176814, term176814.getClass(), "hour", (byte) 21);
        setByteField(term176814, term176814.getClass(), "minute", (byte) 7);
        setByteField(term176814, term176814.getClass(), "second", (byte) 57);
        setIntField(term176814, term176814.getClass(), "nano", 229024114);
        setField(term176809, term176809.getClass(), "time", term176814);
        setField(term176793, term176793.getClass(), "registerTime", term176809);
        setIntField(term176820, term176820.getClass(), "year", 2019);
        setShortField(term176820, term176820.getClass(), "month", (short) 2);
        setShortField(term176820, term176820.getClass(), "day", (short) 24);
        setField(term176819, term176819.getClass(), "date", term176820);
        setByteField(term176824, term176824.getClass(), "hour", (byte) 1);
        setByteField(term176824, term176824.getClass(), "minute", (byte) 34);
        setByteField(term176824, term176824.getClass(), "second", (byte) 39);
        setIntField(term176824, term176824.getClass(), "nano", 549100800);
        setField(term176819, term176819.getClass(), "time", term176824);
        setField(term176793, term176793.getClass(), "accessTime", term176819);
        setField(term176791, term176791.getClass(), "card", term176793);
        setField(term176791, term176791.getClass(), "userName", "SqNOfacBZj");
        setIntField(term176791, term176791.getClass(), "level", 1803166412);
        setIntField(term176791, term176791.getClass(), "reincarnationNum", -1337767440);
        setLongField(term176791, term176791.getClass(), "exp", -2195609154813833144L);
        setLongField(term176791, term176791.getClass(), "point", -4870790849054926111L);
        setLongField(term176791, term176791.getClass(), "totalPoint", 903724671589694521L);
        setIntField(term176791, term176791.getClass(), "playCount", -1072471087);
        setIntField(term176791, term176791.getClass(), "jewelCount", 1054147511);
        setIntField(term176791, term176791.getClass(), "totalJewelCount", -872690097);
        setIntField(term176791, term176791.getClass(), "medalCount", -110719515);
        setIntField(term176791, term176791.getClass(), "playerRating", 1974973897);
        setIntField(term176791, term176791.getClass(), "highestRating", -1698854);
        setIntField(term176791, term176791.getClass(), "battlePoint", 1352029332);
        setIntField(term176791, term176791.getClass(), "bestBattlePoint", 1637635293);
        setIntField(term176791, term176791.getClass(), "overDamageBattlePoint", -1074960601);
        setBooleanField(term176791, term176791.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term176791, term176791.getClass(), "nameplateId", -1987365619);
        setIntField(term176791, term176791.getClass(), "trophyId", 662229600);
        setIntField(term176791, term176791.getClass(), "cardId", -1332957093);
        setIntField(term176791, term176791.getClass(), "characterId", 424707046);
        setIntField(term176791, term176791.getClass(), "characterVoiceNo", 1963864974);
        setIntField(term176791, term176791.getClass(), "tabSetting", 1696691227);
        setIntField(term176791, term176791.getClass(), "tabSortSetting", 1691243165);
        setIntField(term176791, term176791.getClass(), "cardCategorySetting", 312394553);
        setIntField(term176791, term176791.getClass(), "cardSortSetting", -1525147416);
        setIntField(term176791, term176791.getClass(), "rivalScoreCategorySetting", -1385830514);
        setIntField(term176791, term176791.getClass(), "playedTutorialBit", 459609873);
        setIntField(term176791, term176791.getClass(), "firstTutorialCancelNum", 1965021427);
        setLongField(term176791, term176791.getClass(), "sumTechHighScore", 7585258225423451405L);
        setLongField(term176791, term176791.getClass(), "sumTechBasicHighScore", -175474244919865471L);
        setLongField(term176791, term176791.getClass(), "sumTechAdvancedHighScore", -5671896210054445569L);
        setLongField(term176791, term176791.getClass(), "sumTechExpertHighScore", 4341871498922510604L);
        setLongField(term176791, term176791.getClass(), "sumTechMasterHighScore", -1045165329910814240L);
        setLongField(term176791, term176791.getClass(), "sumTechLunaticHighScore", -3331844424181822582L);
        setLongField(term176791, term176791.getClass(), "sumBattleHighScore", 5635233698057523929L);
        setLongField(term176791, term176791.getClass(), "sumBattleBasicHighScore", -8043974053102621324L);
        setLongField(term176791, term176791.getClass(), "sumBattleAdvancedHighScore", -5361818889594522955L);
        setLongField(term176791, term176791.getClass(), "sumBattleExpertHighScore", 3199971317374960975L);
        setLongField(term176791, term176791.getClass(), "sumBattleMasterHighScore", 6108766008294079173L);
        setLongField(term176791, term176791.getClass(), "sumBattleLunaticHighScore", 567756631408113202L);
        setField(term176791, term176791.getClass(), "eventWatchedDate", "dbxoYBTgGN");
        setField(term176791, term176791.getClass(), "cmEventWatchedDate", "adxRdfXsVs");
        setField(term176791, term176791.getClass(), "firstGameId", "oqJIiLGVuh");
        setField(term176791, term176791.getClass(), "firstRomVersion", "DxDRAaptzI");
        setField(term176791, term176791.getClass(), "firstDataVersion", "kZUSkAgsvX");
        setField(term176791, term176791.getClass(), "firstPlayDate", "JpNgFUEtkd");
        setField(term176791, term176791.getClass(), "lastGameId", "HAvelKHpob");
        setField(term176791, term176791.getClass(), "lastRomVersion", "nFKhEfljjj");
        setField(term176791, term176791.getClass(), "lastDataVersion", "TbAlefWyzU");
        setField(term176791, term176791.getClass(), "compatibleCmVersion", "CVIsKWEpTu");
        setField(term176791, term176791.getClass(), "lastPlayDate", "HlqCQVVCvy");
        setIntField(term176791, term176791.getClass(), "lastPlaceId", 1701555080);
        setField(term176791, term176791.getClass(), "lastPlaceName", "eSjqyipIEH");
        setIntField(term176791, term176791.getClass(), "lastRegionId", 954901997);
        setField(term176791, term176791.getClass(), "lastRegionName", "DoHfdWKluP");
        setIntField(term176791, term176791.getClass(), "lastAllNetId", -1011081721);
        setField(term176791, term176791.getClass(), "lastClientId", "APjhJaIDgk");
        setIntField(term176791, term176791.getClass(), "lastUsedDeckId", -1158219481);
        setIntField(term176791, term176791.getClass(), "lastPlayMusicLevel", 1963971471);
        setIntField(term176791, term176791.getClass(), "lastEmoneyBrand", 188111384);
        setField(term176789, term176789.getClass(), "user", term176791);
        setIntField(term176789, term176789.getClass(), "characterId", 1383690151);
        setIntField(term176789, term176789.getClass(), "costumeId", 680948243);
        setIntField(term176789, term176789.getClass(), "attachmentId", 1325070569);
        setIntField(term176789, term176789.getClass(), "playCount", -325130467);
        setIntField(term176789, term176789.getClass(), "intimateLevel", -1728816604);
        setIntField(term176789, term176789.getClass(), "intimateCount", -759660487);
        setIntField(term176789, term176789.getClass(), "intimateCountRewarded", 214806173);
        setField(term176789, term176789.getClass(), "intimateCountDate", "QoFSUTaQng");
        setBooleanField(term176789, term176789.getClass(), "isNew", false);
        term177074 = new Integer(1931596545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177074;
        callMethod(klass, "setIntimateCount", argTypes, term176789, args);
    }

};


