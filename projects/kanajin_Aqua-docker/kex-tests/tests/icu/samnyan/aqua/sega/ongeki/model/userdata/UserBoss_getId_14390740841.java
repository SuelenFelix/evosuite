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

public class UserBoss_getId_14390740841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134150;

    public UserBoss_getId_14390740841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134156 = new Long(-5258945362776941718L);
        term134150 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term134152 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term134154 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134175 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134185 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134150, term134150.getClass(), "id", 46435567389697145L);
        setLongField(term134152, term134152.getClass(), "id", 4528503582253418692L);
        setLongField(term134154, term134154.getClass(), "id", -2690518275422197871L);
        setField(term134154, term134154.getClass(), "extId", term134156);
        setField(term134154, term134154.getClass(), "luid", "jsThoorJsk");
        setIntField(term134171, term134171.getClass(), "year", 2018);
        setShortField(term134171, term134171.getClass(), "month", (short) 12);
        setShortField(term134171, term134171.getClass(), "day", (short) 4);
        setField(term134170, term134170.getClass(), "date", term134171);
        setByteField(term134175, term134175.getClass(), "hour", (byte) 6);
        setByteField(term134175, term134175.getClass(), "minute", (byte) 23);
        setByteField(term134175, term134175.getClass(), "second", (byte) 36);
        setIntField(term134175, term134175.getClass(), "nano", 89535482);
        setField(term134170, term134170.getClass(), "time", term134175);
        setField(term134154, term134154.getClass(), "registerTime", term134170);
        setIntField(term134181, term134181.getClass(), "year", 2020);
        setShortField(term134181, term134181.getClass(), "month", (short) 1);
        setShortField(term134181, term134181.getClass(), "day", (short) 16);
        setField(term134180, term134180.getClass(), "date", term134181);
        setByteField(term134185, term134185.getClass(), "hour", (byte) 1);
        setByteField(term134185, term134185.getClass(), "minute", (byte) 58);
        setByteField(term134185, term134185.getClass(), "second", (byte) 17);
        setIntField(term134185, term134185.getClass(), "nano", 383254195);
        setField(term134180, term134180.getClass(), "time", term134185);
        setField(term134154, term134154.getClass(), "accessTime", term134180);
        setField(term134152, term134152.getClass(), "card", term134154);
        setField(term134152, term134152.getClass(), "userName", "DiLoLWWibV");
        setIntField(term134152, term134152.getClass(), "level", 403780056);
        setIntField(term134152, term134152.getClass(), "reincarnationNum", 1834523834);
        setLongField(term134152, term134152.getClass(), "exp", -3513383423404213708L);
        setLongField(term134152, term134152.getClass(), "point", -5845226185877177828L);
        setLongField(term134152, term134152.getClass(), "totalPoint", 4193347497292123516L);
        setIntField(term134152, term134152.getClass(), "playCount", 399538802);
        setIntField(term134152, term134152.getClass(), "jewelCount", 293797529);
        setIntField(term134152, term134152.getClass(), "totalJewelCount", -2060795821);
        setIntField(term134152, term134152.getClass(), "medalCount", -159511730);
        setIntField(term134152, term134152.getClass(), "playerRating", 370898129);
        setIntField(term134152, term134152.getClass(), "highestRating", -970532580);
        setIntField(term134152, term134152.getClass(), "battlePoint", 869653312);
        setIntField(term134152, term134152.getClass(), "bestBattlePoint", 464373107);
        setIntField(term134152, term134152.getClass(), "overDamageBattlePoint", -153889480);
        setBooleanField(term134152, term134152.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term134152, term134152.getClass(), "nameplateId", 1435683093);
        setIntField(term134152, term134152.getClass(), "trophyId", -1906424793);
        setIntField(term134152, term134152.getClass(), "cardId", 1262036398);
        setIntField(term134152, term134152.getClass(), "characterId", 1864946460);
        setIntField(term134152, term134152.getClass(), "characterVoiceNo", -1209161295);
        setIntField(term134152, term134152.getClass(), "tabSetting", 341162488);
        setIntField(term134152, term134152.getClass(), "tabSortSetting", 1772832909);
        setIntField(term134152, term134152.getClass(), "cardCategorySetting", -1791192223);
        setIntField(term134152, term134152.getClass(), "cardSortSetting", -384087961);
        setIntField(term134152, term134152.getClass(), "rivalScoreCategorySetting", 2102378795);
        setIntField(term134152, term134152.getClass(), "playedTutorialBit", 180198397);
        setIntField(term134152, term134152.getClass(), "firstTutorialCancelNum", -763713763);
        setLongField(term134152, term134152.getClass(), "sumTechHighScore", 7450391350358787343L);
        setLongField(term134152, term134152.getClass(), "sumTechBasicHighScore", -3814634232383133087L);
        setLongField(term134152, term134152.getClass(), "sumTechAdvancedHighScore", 7828748639379812441L);
        setLongField(term134152, term134152.getClass(), "sumTechExpertHighScore", 1909512074441888713L);
        setLongField(term134152, term134152.getClass(), "sumTechMasterHighScore", 7880714362541862986L);
        setLongField(term134152, term134152.getClass(), "sumTechLunaticHighScore", -5754640709805732414L);
        setLongField(term134152, term134152.getClass(), "sumBattleHighScore", -3408135209610181326L);
        setLongField(term134152, term134152.getClass(), "sumBattleBasicHighScore", 8683108322318426056L);
        setLongField(term134152, term134152.getClass(), "sumBattleAdvancedHighScore", -5382851182958079672L);
        setLongField(term134152, term134152.getClass(), "sumBattleExpertHighScore", 8614917776517183303L);
        setLongField(term134152, term134152.getClass(), "sumBattleMasterHighScore", 7949132823060621518L);
        setLongField(term134152, term134152.getClass(), "sumBattleLunaticHighScore", -6884185215364682146L);
        setField(term134152, term134152.getClass(), "eventWatchedDate", "jLARiCBiTZ");
        setField(term134152, term134152.getClass(), "cmEventWatchedDate", "qgloCkfuKr");
        setField(term134152, term134152.getClass(), "firstGameId", "KKIqUqWzEr");
        setField(term134152, term134152.getClass(), "firstRomVersion", "ERiiSXCvBM");
        setField(term134152, term134152.getClass(), "firstDataVersion", "RgePgJxaiq");
        setField(term134152, term134152.getClass(), "firstPlayDate", "wbdTRzpToE");
        setField(term134152, term134152.getClass(), "lastGameId", "hYyOXAATCh");
        setField(term134152, term134152.getClass(), "lastRomVersion", "UbvbXQRnLW");
        setField(term134152, term134152.getClass(), "lastDataVersion", "CkIbQCWOgW");
        setField(term134152, term134152.getClass(), "compatibleCmVersion", "JWaRuPqymE");
        setField(term134152, term134152.getClass(), "lastPlayDate", "nTasTwGyTu");
        setIntField(term134152, term134152.getClass(), "lastPlaceId", -1574668692);
        setField(term134152, term134152.getClass(), "lastPlaceName", "qRRPimcPhW");
        setIntField(term134152, term134152.getClass(), "lastRegionId", -657503703);
        setField(term134152, term134152.getClass(), "lastRegionName", "vhGXukwBWg");
        setIntField(term134152, term134152.getClass(), "lastAllNetId", -1456107555);
        setField(term134152, term134152.getClass(), "lastClientId", "JahleHixdz");
        setIntField(term134152, term134152.getClass(), "lastUsedDeckId", -99536224);
        setIntField(term134152, term134152.getClass(), "lastPlayMusicLevel", 864697708);
        setIntField(term134152, term134152.getClass(), "lastEmoneyBrand", -218244630);
        setField(term134150, term134150.getClass(), "user", term134152);
        setIntField(term134150, term134150.getClass(), "musicId", -963363890);
        setIntField(term134150, term134150.getClass(), "damage", 1294401720);
        setBooleanField(term134150, term134150.getClass(), "isClear", true);
        setIntField(term134150, term134150.getClass(), "eventId", -1605686410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term134150, args);
    }

};


