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

public class UserChapter_setLastPlayMusicId_25004301117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90998;
     Object term91272;

    public UserChapter_setLastPlayMusicId_25004301117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91004 = new Long(9205327385733285058L);
        term90998 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term91000 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term91002 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term91018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91023 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91033 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90998, term90998.getClass(), "id", 4071217913411314763L);
        setLongField(term91000, term91000.getClass(), "id", -1949784411261393756L);
        setLongField(term91002, term91002.getClass(), "id", 4326906202774797079L);
        setField(term91002, term91002.getClass(), "extId", term91004);
        setField(term91002, term91002.getClass(), "luid", "phgJprcnjd");
        setIntField(term91019, term91019.getClass(), "year", 2029);
        setShortField(term91019, term91019.getClass(), "month", (short) 10);
        setShortField(term91019, term91019.getClass(), "day", (short) 12);
        setField(term91018, term91018.getClass(), "date", term91019);
        setByteField(term91023, term91023.getClass(), "hour", (byte) 12);
        setByteField(term91023, term91023.getClass(), "minute", (byte) 8);
        setByteField(term91023, term91023.getClass(), "second", (byte) 27);
        setIntField(term91023, term91023.getClass(), "nano", 729635487);
        setField(term91018, term91018.getClass(), "time", term91023);
        setField(term91002, term91002.getClass(), "registerTime", term91018);
        setIntField(term91029, term91029.getClass(), "year", 2015);
        setShortField(term91029, term91029.getClass(), "month", (short) 3);
        setShortField(term91029, term91029.getClass(), "day", (short) 29);
        setField(term91028, term91028.getClass(), "date", term91029);
        setByteField(term91033, term91033.getClass(), "hour", (byte) 23);
        setByteField(term91033, term91033.getClass(), "minute", (byte) 1);
        setByteField(term91033, term91033.getClass(), "second", (byte) 57);
        setIntField(term91033, term91033.getClass(), "nano", 425020447);
        setField(term91028, term91028.getClass(), "time", term91033);
        setField(term91002, term91002.getClass(), "accessTime", term91028);
        setField(term91000, term91000.getClass(), "card", term91002);
        setField(term91000, term91000.getClass(), "userName", "RRjrjGfCoC");
        setIntField(term91000, term91000.getClass(), "level", 1792344129);
        setIntField(term91000, term91000.getClass(), "reincarnationNum", -1718734463);
        setLongField(term91000, term91000.getClass(), "exp", 1631839905932689139L);
        setLongField(term91000, term91000.getClass(), "point", -4367338074282817952L);
        setLongField(term91000, term91000.getClass(), "totalPoint", -8232322220850093189L);
        setIntField(term91000, term91000.getClass(), "playCount", -843385533);
        setIntField(term91000, term91000.getClass(), "jewelCount", -156627014);
        setIntField(term91000, term91000.getClass(), "totalJewelCount", -933160129);
        setIntField(term91000, term91000.getClass(), "medalCount", 1272821016);
        setIntField(term91000, term91000.getClass(), "playerRating", -1553822493);
        setIntField(term91000, term91000.getClass(), "highestRating", -623107839);
        setIntField(term91000, term91000.getClass(), "battlePoint", -598781625);
        setIntField(term91000, term91000.getClass(), "bestBattlePoint", -1717992579);
        setIntField(term91000, term91000.getClass(), "overDamageBattlePoint", 271835355);
        setBooleanField(term91000, term91000.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term91000, term91000.getClass(), "nameplateId", -715995272);
        setIntField(term91000, term91000.getClass(), "trophyId", 1175202910);
        setIntField(term91000, term91000.getClass(), "cardId", 1984427818);
        setIntField(term91000, term91000.getClass(), "characterId", 163785192);
        setIntField(term91000, term91000.getClass(), "characterVoiceNo", 699884037);
        setIntField(term91000, term91000.getClass(), "tabSetting", -151920832);
        setIntField(term91000, term91000.getClass(), "tabSortSetting", 1800895955);
        setIntField(term91000, term91000.getClass(), "cardCategorySetting", 1475225110);
        setIntField(term91000, term91000.getClass(), "cardSortSetting", -746882829);
        setIntField(term91000, term91000.getClass(), "rivalScoreCategorySetting", 1303334365);
        setIntField(term91000, term91000.getClass(), "playedTutorialBit", 931490251);
        setIntField(term91000, term91000.getClass(), "firstTutorialCancelNum", -1812785070);
        setLongField(term91000, term91000.getClass(), "sumTechHighScore", 3377774670780456384L);
        setLongField(term91000, term91000.getClass(), "sumTechBasicHighScore", 6661528411672985437L);
        setLongField(term91000, term91000.getClass(), "sumTechAdvancedHighScore", 1150005485970766438L);
        setLongField(term91000, term91000.getClass(), "sumTechExpertHighScore", -477417800078684155L);
        setLongField(term91000, term91000.getClass(), "sumTechMasterHighScore", -2138409635495767018L);
        setLongField(term91000, term91000.getClass(), "sumTechLunaticHighScore", -2465126846058122797L);
        setLongField(term91000, term91000.getClass(), "sumBattleHighScore", -1296243020884964748L);
        setLongField(term91000, term91000.getClass(), "sumBattleBasicHighScore", 2234534677218129148L);
        setLongField(term91000, term91000.getClass(), "sumBattleAdvancedHighScore", 1514427633703984770L);
        setLongField(term91000, term91000.getClass(), "sumBattleExpertHighScore", -6633688490127237966L);
        setLongField(term91000, term91000.getClass(), "sumBattleMasterHighScore", 9021741190754893927L);
        setLongField(term91000, term91000.getClass(), "sumBattleLunaticHighScore", -1822732075600106365L);
        setField(term91000, term91000.getClass(), "eventWatchedDate", "MzbYanIDmI");
        setField(term91000, term91000.getClass(), "cmEventWatchedDate", "RYHcwmdSCF");
        setField(term91000, term91000.getClass(), "firstGameId", "PbtJLrRbsa");
        setField(term91000, term91000.getClass(), "firstRomVersion", "iiDSRMEZEA");
        setField(term91000, term91000.getClass(), "firstDataVersion", "wBhcQErbFz");
        setField(term91000, term91000.getClass(), "firstPlayDate", "iJLzZkhOlH");
        setField(term91000, term91000.getClass(), "lastGameId", "GUDWKmTIil");
        setField(term91000, term91000.getClass(), "lastRomVersion", "hZnzaYDeRe");
        setField(term91000, term91000.getClass(), "lastDataVersion", "TbzRSKYwZN");
        setField(term91000, term91000.getClass(), "compatibleCmVersion", "IMobeYICFK");
        setField(term91000, term91000.getClass(), "lastPlayDate", "HkkBqbwwlq");
        setIntField(term91000, term91000.getClass(), "lastPlaceId", -1062041611);
        setField(term91000, term91000.getClass(), "lastPlaceName", "iJCoKDwoAB");
        setIntField(term91000, term91000.getClass(), "lastRegionId", -2077054717);
        setField(term91000, term91000.getClass(), "lastRegionName", "vmxQPAehpJ");
        setIntField(term91000, term91000.getClass(), "lastAllNetId", 93713831);
        setField(term91000, term91000.getClass(), "lastClientId", "xoFNyRpjCp");
        setIntField(term91000, term91000.getClass(), "lastUsedDeckId", 1530899774);
        setIntField(term91000, term91000.getClass(), "lastPlayMusicLevel", 556786794);
        setIntField(term91000, term91000.getClass(), "lastEmoneyBrand", 2062913883);
        setField(term90998, term90998.getClass(), "user", term91000);
        setIntField(term90998, term90998.getClass(), "chapterId", 873881120);
        setIntField(term90998, term90998.getClass(), "jewelCount", 1451809092);
        setIntField(term90998, term90998.getClass(), "lastPlayMusicCategory", -274316319);
        setIntField(term90998, term90998.getClass(), "lastPlayMusicId", -403442279);
        setIntField(term90998, term90998.getClass(), "lastPlayMusicLevel", 269235773);
        setBooleanField(term90998, term90998.getClass(), "isStoryWatched", true);
        setBooleanField(term90998, term90998.getClass(), "isClear", true);
        setIntField(term90998, term90998.getClass(), "skipTiming1", 87688173);
        setIntField(term90998, term90998.getClass(), "skipTiming2", 979019488);
        term91272 = new Integer(1853235183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term91272;
        callMethod(klass, "setLastPlayMusicId", argTypes, term90998, args);
    }

};


