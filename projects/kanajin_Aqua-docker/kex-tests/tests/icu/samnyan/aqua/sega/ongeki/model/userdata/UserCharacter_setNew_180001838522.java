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
import java.lang.Boolean;

public class UserCharacter_setNew_180001838522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178180;
     Object term178465;

    public UserCharacter_setNew_180001838522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term178186 = new Long(-8303973304709662279L);
        term178180 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term178182 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term178184 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term178200 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178201 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178205 = newInstance(Class.forName("java.time.LocalTime"));
        Object term178210 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178211 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178215 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term178180, term178180.getClass(), "id", -7106226430278364620L);
        setLongField(term178182, term178182.getClass(), "id", 1387221881631678771L);
        setLongField(term178184, term178184.getClass(), "id", 5916238721449000892L);
        setField(term178184, term178184.getClass(), "extId", term178186);
        setField(term178184, term178184.getClass(), "luid", "ruYuUKeyoL");
        setIntField(term178201, term178201.getClass(), "year", 2014);
        setShortField(term178201, term178201.getClass(), "month", (short) 6);
        setShortField(term178201, term178201.getClass(), "day", (short) 27);
        setField(term178200, term178200.getClass(), "date", term178201);
        setByteField(term178205, term178205.getClass(), "hour", (byte) 12);
        setByteField(term178205, term178205.getClass(), "minute", (byte) 38);
        setByteField(term178205, term178205.getClass(), "second", (byte) 25);
        setIntField(term178205, term178205.getClass(), "nano", 969490220);
        setField(term178200, term178200.getClass(), "time", term178205);
        setField(term178184, term178184.getClass(), "registerTime", term178200);
        setIntField(term178211, term178211.getClass(), "year", 2011);
        setShortField(term178211, term178211.getClass(), "month", (short) 3);
        setShortField(term178211, term178211.getClass(), "day", (short) 10);
        setField(term178210, term178210.getClass(), "date", term178211);
        setByteField(term178215, term178215.getClass(), "hour", (byte) 17);
        setByteField(term178215, term178215.getClass(), "minute", (byte) 52);
        setByteField(term178215, term178215.getClass(), "second", (byte) 30);
        setIntField(term178215, term178215.getClass(), "nano", 491721919);
        setField(term178210, term178210.getClass(), "time", term178215);
        setField(term178184, term178184.getClass(), "accessTime", term178210);
        setField(term178182, term178182.getClass(), "card", term178184);
        setField(term178182, term178182.getClass(), "userName", "qZySZAtlWw");
        setIntField(term178182, term178182.getClass(), "level", -715274403);
        setIntField(term178182, term178182.getClass(), "reincarnationNum", -1194682970);
        setLongField(term178182, term178182.getClass(), "exp", -6635895019836817944L);
        setLongField(term178182, term178182.getClass(), "point", 313937491655292425L);
        setLongField(term178182, term178182.getClass(), "totalPoint", 2395306803372361789L);
        setIntField(term178182, term178182.getClass(), "playCount", -800758682);
        setIntField(term178182, term178182.getClass(), "jewelCount", -1806348982);
        setIntField(term178182, term178182.getClass(), "totalJewelCount", 1710916931);
        setIntField(term178182, term178182.getClass(), "medalCount", -476865589);
        setIntField(term178182, term178182.getClass(), "playerRating", -426524240);
        setIntField(term178182, term178182.getClass(), "highestRating", -2094943009);
        setIntField(term178182, term178182.getClass(), "battlePoint", -6347300);
        setIntField(term178182, term178182.getClass(), "bestBattlePoint", -2028885510);
        setIntField(term178182, term178182.getClass(), "overDamageBattlePoint", 1898148089);
        setBooleanField(term178182, term178182.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term178182, term178182.getClass(), "nameplateId", 1620462199);
        setIntField(term178182, term178182.getClass(), "trophyId", -418350686);
        setIntField(term178182, term178182.getClass(), "cardId", 2108089284);
        setIntField(term178182, term178182.getClass(), "characterId", 1042300663);
        setIntField(term178182, term178182.getClass(), "characterVoiceNo", -1957248425);
        setIntField(term178182, term178182.getClass(), "tabSetting", 437128088);
        setIntField(term178182, term178182.getClass(), "tabSortSetting", 1196324194);
        setIntField(term178182, term178182.getClass(), "cardCategorySetting", 489535471);
        setIntField(term178182, term178182.getClass(), "cardSortSetting", -2003174737);
        setIntField(term178182, term178182.getClass(), "rivalScoreCategorySetting", 554212199);
        setIntField(term178182, term178182.getClass(), "playedTutorialBit", 389737737);
        setIntField(term178182, term178182.getClass(), "firstTutorialCancelNum", 562342011);
        setLongField(term178182, term178182.getClass(), "sumTechHighScore", 3404140293557584459L);
        setLongField(term178182, term178182.getClass(), "sumTechBasicHighScore", 4367141646424029218L);
        setLongField(term178182, term178182.getClass(), "sumTechAdvancedHighScore", -2295495097049715790L);
        setLongField(term178182, term178182.getClass(), "sumTechExpertHighScore", 6561564014211458803L);
        setLongField(term178182, term178182.getClass(), "sumTechMasterHighScore", 8887091749598931285L);
        setLongField(term178182, term178182.getClass(), "sumTechLunaticHighScore", 8571127439910031865L);
        setLongField(term178182, term178182.getClass(), "sumBattleHighScore", -691540277685530027L);
        setLongField(term178182, term178182.getClass(), "sumBattleBasicHighScore", -3455464316097576650L);
        setLongField(term178182, term178182.getClass(), "sumBattleAdvancedHighScore", 5727167095354223682L);
        setLongField(term178182, term178182.getClass(), "sumBattleExpertHighScore", 1228393249690916449L);
        setLongField(term178182, term178182.getClass(), "sumBattleMasterHighScore", 2198010427584003004L);
        setLongField(term178182, term178182.getClass(), "sumBattleLunaticHighScore", -443151478836115409L);
        setField(term178182, term178182.getClass(), "eventWatchedDate", "XDftcuEVIB");
        setField(term178182, term178182.getClass(), "cmEventWatchedDate", "icQsCgiPfd");
        setField(term178182, term178182.getClass(), "firstGameId", "PVyTkZKjNq");
        setField(term178182, term178182.getClass(), "firstRomVersion", "RNUULrdSpr");
        setField(term178182, term178182.getClass(), "firstDataVersion", "OBtSUjwRLK");
        setField(term178182, term178182.getClass(), "firstPlayDate", "QbLHBJXaMu");
        setField(term178182, term178182.getClass(), "lastGameId", "OYMmpMJVgl");
        setField(term178182, term178182.getClass(), "lastRomVersion", "auhFemTfIs");
        setField(term178182, term178182.getClass(), "lastDataVersion", "IhxGrgSVtO");
        setField(term178182, term178182.getClass(), "compatibleCmVersion", "SoHyyXooNj");
        setField(term178182, term178182.getClass(), "lastPlayDate", "ewsxMpzQJL");
        setIntField(term178182, term178182.getClass(), "lastPlaceId", 1494869778);
        setField(term178182, term178182.getClass(), "lastPlaceName", "ckvWshDuZV");
        setIntField(term178182, term178182.getClass(), "lastRegionId", 1841534409);
        setField(term178182, term178182.getClass(), "lastRegionName", "WsZSiTmUAb");
        setIntField(term178182, term178182.getClass(), "lastAllNetId", -454011518);
        setField(term178182, term178182.getClass(), "lastClientId", "unlHlivihq");
        setIntField(term178182, term178182.getClass(), "lastUsedDeckId", 912352909);
        setIntField(term178182, term178182.getClass(), "lastPlayMusicLevel", -1991098590);
        setIntField(term178182, term178182.getClass(), "lastEmoneyBrand", -1125437654);
        setField(term178180, term178180.getClass(), "user", term178182);
        setIntField(term178180, term178180.getClass(), "characterId", -1672681991);
        setIntField(term178180, term178180.getClass(), "costumeId", 1344218803);
        setIntField(term178180, term178180.getClass(), "attachmentId", 997123210);
        setIntField(term178180, term178180.getClass(), "playCount", 354354316);
        setIntField(term178180, term178180.getClass(), "intimateLevel", 1271683860);
        setIntField(term178180, term178180.getClass(), "intimateCount", 391963036);
        setIntField(term178180, term178180.getClass(), "intimateCountRewarded", 971387953);
        setField(term178180, term178180.getClass(), "intimateCountDate", "SpWXYUYOyr");
        setBooleanField(term178180, term178180.getClass(), "isNew", false);
        term178465 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term178465;
        callMethod(klass, "setNew", argTypes, term178180, args);
    }

};


