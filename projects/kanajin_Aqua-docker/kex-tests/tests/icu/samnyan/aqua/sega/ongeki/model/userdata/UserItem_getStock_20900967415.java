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

public class UserItem_getStock_20900967415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104727;

    public UserItem_getStock_20900967415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104733 = new Long(-2955854401507097864L);
        term104727 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term104729 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term104731 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term104747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104752 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104762 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104727, term104727.getClass(), "id", -1003291252292924901L);
        setLongField(term104729, term104729.getClass(), "id", 3561198714285352894L);
        setLongField(term104731, term104731.getClass(), "id", 6434931519154050828L);
        setField(term104731, term104731.getClass(), "extId", term104733);
        setField(term104731, term104731.getClass(), "luid", "FaJjdWrmzf");
        setIntField(term104748, term104748.getClass(), "year", 2021);
        setShortField(term104748, term104748.getClass(), "month", (short) 5);
        setShortField(term104748, term104748.getClass(), "day", (short) 7);
        setField(term104747, term104747.getClass(), "date", term104748);
        setByteField(term104752, term104752.getClass(), "hour", (byte) 16);
        setByteField(term104752, term104752.getClass(), "minute", (byte) 55);
        setByteField(term104752, term104752.getClass(), "second", (byte) 11);
        setIntField(term104752, term104752.getClass(), "nano", 243196047);
        setField(term104747, term104747.getClass(), "time", term104752);
        setField(term104731, term104731.getClass(), "registerTime", term104747);
        setIntField(term104758, term104758.getClass(), "year", 2023);
        setShortField(term104758, term104758.getClass(), "month", (short) 8);
        setShortField(term104758, term104758.getClass(), "day", (short) 23);
        setField(term104757, term104757.getClass(), "date", term104758);
        setByteField(term104762, term104762.getClass(), "hour", (byte) 12);
        setByteField(term104762, term104762.getClass(), "minute", (byte) 18);
        setByteField(term104762, term104762.getClass(), "second", (byte) 57);
        setIntField(term104762, term104762.getClass(), "nano", 764903264);
        setField(term104757, term104757.getClass(), "time", term104762);
        setField(term104731, term104731.getClass(), "accessTime", term104757);
        setField(term104729, term104729.getClass(), "card", term104731);
        setField(term104729, term104729.getClass(), "userName", "qBRgIZjugc");
        setIntField(term104729, term104729.getClass(), "level", -653095451);
        setIntField(term104729, term104729.getClass(), "reincarnationNum", 1716408118);
        setLongField(term104729, term104729.getClass(), "exp", 5161439677348398752L);
        setLongField(term104729, term104729.getClass(), "point", -7061143542246288858L);
        setLongField(term104729, term104729.getClass(), "totalPoint", 8169580960659211736L);
        setIntField(term104729, term104729.getClass(), "playCount", -1873669731);
        setIntField(term104729, term104729.getClass(), "jewelCount", 2124411599);
        setIntField(term104729, term104729.getClass(), "totalJewelCount", -71602583);
        setIntField(term104729, term104729.getClass(), "medalCount", -1926082322);
        setIntField(term104729, term104729.getClass(), "playerRating", 210448865);
        setIntField(term104729, term104729.getClass(), "highestRating", 1795078195);
        setIntField(term104729, term104729.getClass(), "battlePoint", -118250608);
        setIntField(term104729, term104729.getClass(), "bestBattlePoint", -19855467);
        setIntField(term104729, term104729.getClass(), "overDamageBattlePoint", -381214484);
        setBooleanField(term104729, term104729.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term104729, term104729.getClass(), "nameplateId", 1908628900);
        setIntField(term104729, term104729.getClass(), "trophyId", -254024426);
        setIntField(term104729, term104729.getClass(), "cardId", 2035106255);
        setIntField(term104729, term104729.getClass(), "characterId", -65925181);
        setIntField(term104729, term104729.getClass(), "characterVoiceNo", -134969175);
        setIntField(term104729, term104729.getClass(), "tabSetting", 985529917);
        setIntField(term104729, term104729.getClass(), "tabSortSetting", -1459510700);
        setIntField(term104729, term104729.getClass(), "cardCategorySetting", -1060341148);
        setIntField(term104729, term104729.getClass(), "cardSortSetting", 1931459176);
        setIntField(term104729, term104729.getClass(), "rivalScoreCategorySetting", 266090245);
        setIntField(term104729, term104729.getClass(), "playedTutorialBit", 1329931034);
        setIntField(term104729, term104729.getClass(), "firstTutorialCancelNum", -2040965607);
        setLongField(term104729, term104729.getClass(), "sumTechHighScore", -5551356079533519971L);
        setLongField(term104729, term104729.getClass(), "sumTechBasicHighScore", 6144678288643819644L);
        setLongField(term104729, term104729.getClass(), "sumTechAdvancedHighScore", -8132258096950512306L);
        setLongField(term104729, term104729.getClass(), "sumTechExpertHighScore", -8619557135959868474L);
        setLongField(term104729, term104729.getClass(), "sumTechMasterHighScore", -6530707478457931445L);
        setLongField(term104729, term104729.getClass(), "sumTechLunaticHighScore", 2688818424894417724L);
        setLongField(term104729, term104729.getClass(), "sumBattleHighScore", 1307629924223046806L);
        setLongField(term104729, term104729.getClass(), "sumBattleBasicHighScore", -7754415683690581232L);
        setLongField(term104729, term104729.getClass(), "sumBattleAdvancedHighScore", 7524357305395972651L);
        setLongField(term104729, term104729.getClass(), "sumBattleExpertHighScore", -6203733697011665719L);
        setLongField(term104729, term104729.getClass(), "sumBattleMasterHighScore", 4013144018451677763L);
        setLongField(term104729, term104729.getClass(), "sumBattleLunaticHighScore", -6089031270216011230L);
        setField(term104729, term104729.getClass(), "eventWatchedDate", "ZPnUGVLyiF");
        setField(term104729, term104729.getClass(), "cmEventWatchedDate", "iGWKoojIzf");
        setField(term104729, term104729.getClass(), "firstGameId", "hBwCfmunWp");
        setField(term104729, term104729.getClass(), "firstRomVersion", "dEmUNxEaGp");
        setField(term104729, term104729.getClass(), "firstDataVersion", "FiihXkdDjE");
        setField(term104729, term104729.getClass(), "firstPlayDate", "ttkSFEAzwY");
        setField(term104729, term104729.getClass(), "lastGameId", "ZTUqSMjJHU");
        setField(term104729, term104729.getClass(), "lastRomVersion", "TAvUGVCPaa");
        setField(term104729, term104729.getClass(), "lastDataVersion", "oacMptGUKE");
        setField(term104729, term104729.getClass(), "compatibleCmVersion", "vjVwvYdNhl");
        setField(term104729, term104729.getClass(), "lastPlayDate", "sqJqznmMco");
        setIntField(term104729, term104729.getClass(), "lastPlaceId", 2056421741);
        setField(term104729, term104729.getClass(), "lastPlaceName", "ZufWIAjLXm");
        setIntField(term104729, term104729.getClass(), "lastRegionId", 473013403);
        setField(term104729, term104729.getClass(), "lastRegionName", "rXhBlGnTbp");
        setIntField(term104729, term104729.getClass(), "lastAllNetId", 139601586);
        setField(term104729, term104729.getClass(), "lastClientId", "RXrliVaPrQ");
        setIntField(term104729, term104729.getClass(), "lastUsedDeckId", 198201617);
        setIntField(term104729, term104729.getClass(), "lastPlayMusicLevel", -816938071);
        setIntField(term104729, term104729.getClass(), "lastEmoneyBrand", -703996658);
        setField(term104727, term104727.getClass(), "user", term104729);
        setIntField(term104727, term104727.getClass(), "itemKind", -1472021518);
        setIntField(term104727, term104727.getClass(), "itemId", 1339815724);
        setIntField(term104727, term104727.getClass(), "stock", 128296124);
        setBooleanField(term104727, term104727.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term104727, args);
    }

};


