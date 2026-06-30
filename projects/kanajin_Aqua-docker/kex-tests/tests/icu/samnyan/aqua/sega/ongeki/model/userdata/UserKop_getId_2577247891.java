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

public class UserKop_getId_2577247891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271165;

    public UserKop_getId_2577247891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term271171 = new Long(-1978508496784157882L);
        term271165 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term271167 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term271169 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term271185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271190 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271200 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term271165, term271165.getClass(), "id", -4887332090508106929L);
        setLongField(term271167, term271167.getClass(), "id", -1215614544251852617L);
        setLongField(term271169, term271169.getClass(), "id", -435558521951399005L);
        setField(term271169, term271169.getClass(), "extId", term271171);
        setField(term271169, term271169.getClass(), "luid", "HEBNhULneC");
        setIntField(term271186, term271186.getClass(), "year", 2010);
        setShortField(term271186, term271186.getClass(), "month", (short) 1);
        setShortField(term271186, term271186.getClass(), "day", (short) 16);
        setField(term271185, term271185.getClass(), "date", term271186);
        setByteField(term271190, term271190.getClass(), "hour", (byte) 9);
        setByteField(term271190, term271190.getClass(), "minute", (byte) 12);
        setByteField(term271190, term271190.getClass(), "second", (byte) 44);
        setIntField(term271190, term271190.getClass(), "nano", 134721246);
        setField(term271185, term271185.getClass(), "time", term271190);
        setField(term271169, term271169.getClass(), "registerTime", term271185);
        setIntField(term271196, term271196.getClass(), "year", 2018);
        setShortField(term271196, term271196.getClass(), "month", (short) 8);
        setShortField(term271196, term271196.getClass(), "day", (short) 29);
        setField(term271195, term271195.getClass(), "date", term271196);
        setByteField(term271200, term271200.getClass(), "hour", (byte) 10);
        setByteField(term271200, term271200.getClass(), "minute", (byte) 58);
        setByteField(term271200, term271200.getClass(), "second", (byte) 45);
        setIntField(term271200, term271200.getClass(), "nano", 987262592);
        setField(term271195, term271195.getClass(), "time", term271200);
        setField(term271169, term271169.getClass(), "accessTime", term271195);
        setField(term271167, term271167.getClass(), "card", term271169);
        setField(term271167, term271167.getClass(), "userName", "PxUDJOUGKY");
        setIntField(term271167, term271167.getClass(), "level", 1705304596);
        setIntField(term271167, term271167.getClass(), "reincarnationNum", -1346401084);
        setLongField(term271167, term271167.getClass(), "exp", 7481966885540014554L);
        setLongField(term271167, term271167.getClass(), "point", -1996675334260413630L);
        setLongField(term271167, term271167.getClass(), "totalPoint", 852205516604605405L);
        setIntField(term271167, term271167.getClass(), "playCount", -1539654405);
        setIntField(term271167, term271167.getClass(), "jewelCount", 1858554469);
        setIntField(term271167, term271167.getClass(), "totalJewelCount", -1894464350);
        setIntField(term271167, term271167.getClass(), "medalCount", -1711976057);
        setIntField(term271167, term271167.getClass(), "playerRating", -390494018);
        setIntField(term271167, term271167.getClass(), "highestRating", 930338389);
        setIntField(term271167, term271167.getClass(), "battlePoint", -1648110301);
        setIntField(term271167, term271167.getClass(), "bestBattlePoint", -1092422328);
        setIntField(term271167, term271167.getClass(), "overDamageBattlePoint", 1635493456);
        setBooleanField(term271167, term271167.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term271167, term271167.getClass(), "nameplateId", -1098683664);
        setIntField(term271167, term271167.getClass(), "trophyId", -1070840970);
        setIntField(term271167, term271167.getClass(), "cardId", -1744426701);
        setIntField(term271167, term271167.getClass(), "characterId", -1939540947);
        setIntField(term271167, term271167.getClass(), "characterVoiceNo", 1006687897);
        setIntField(term271167, term271167.getClass(), "tabSetting", 1751688546);
        setIntField(term271167, term271167.getClass(), "tabSortSetting", -2104821618);
        setIntField(term271167, term271167.getClass(), "cardCategorySetting", 1326846039);
        setIntField(term271167, term271167.getClass(), "cardSortSetting", -1047070774);
        setIntField(term271167, term271167.getClass(), "rivalScoreCategorySetting", -533633117);
        setIntField(term271167, term271167.getClass(), "playedTutorialBit", 205317695);
        setIntField(term271167, term271167.getClass(), "firstTutorialCancelNum", 130711950);
        setLongField(term271167, term271167.getClass(), "sumTechHighScore", 7668468729288543085L);
        setLongField(term271167, term271167.getClass(), "sumTechBasicHighScore", 4893413470713559397L);
        setLongField(term271167, term271167.getClass(), "sumTechAdvancedHighScore", -5716605880716134379L);
        setLongField(term271167, term271167.getClass(), "sumTechExpertHighScore", -571217323782832069L);
        setLongField(term271167, term271167.getClass(), "sumTechMasterHighScore", 1899181225864408664L);
        setLongField(term271167, term271167.getClass(), "sumTechLunaticHighScore", 6276501829169735030L);
        setLongField(term271167, term271167.getClass(), "sumBattleHighScore", 2002485657434234699L);
        setLongField(term271167, term271167.getClass(), "sumBattleBasicHighScore", -3820686357923901479L);
        setLongField(term271167, term271167.getClass(), "sumBattleAdvancedHighScore", -854823253852744966L);
        setLongField(term271167, term271167.getClass(), "sumBattleExpertHighScore", 1085798628452779129L);
        setLongField(term271167, term271167.getClass(), "sumBattleMasterHighScore", -4170068409437030484L);
        setLongField(term271167, term271167.getClass(), "sumBattleLunaticHighScore", -736987992347029085L);
        setField(term271167, term271167.getClass(), "eventWatchedDate", "QHNYCCZevd");
        setField(term271167, term271167.getClass(), "cmEventWatchedDate", "jAMvrvDOhP");
        setField(term271167, term271167.getClass(), "firstGameId", "yrDxYzmHMC");
        setField(term271167, term271167.getClass(), "firstRomVersion", "rDpoPFYXSz");
        setField(term271167, term271167.getClass(), "firstDataVersion", "JwCEdzoMPC");
        setField(term271167, term271167.getClass(), "firstPlayDate", "genTuEgRsd");
        setField(term271167, term271167.getClass(), "lastGameId", "XMgPdlQkhy");
        setField(term271167, term271167.getClass(), "lastRomVersion", "FagcUlRRig");
        setField(term271167, term271167.getClass(), "lastDataVersion", "eBoBopUIXv");
        setField(term271167, term271167.getClass(), "compatibleCmVersion", "oQrHpsHWfU");
        setField(term271167, term271167.getClass(), "lastPlayDate", "cRIqcVypqV");
        setIntField(term271167, term271167.getClass(), "lastPlaceId", 370999352);
        setField(term271167, term271167.getClass(), "lastPlaceName", "HkjSosreWD");
        setIntField(term271167, term271167.getClass(), "lastRegionId", -451429306);
        setField(term271167, term271167.getClass(), "lastRegionName", "iwCfNJPqoQ");
        setIntField(term271167, term271167.getClass(), "lastAllNetId", -131211631);
        setField(term271167, term271167.getClass(), "lastClientId", "dFLZhdWnQQ");
        setIntField(term271167, term271167.getClass(), "lastUsedDeckId", 1582546878);
        setIntField(term271167, term271167.getClass(), "lastPlayMusicLevel", -1660860876);
        setIntField(term271167, term271167.getClass(), "lastEmoneyBrand", -380593610);
        setField(term271165, term271165.getClass(), "user", term271167);
        setField(term271165, term271165.getClass(), "authKey", "iviSqxxKri");
        setIntField(term271165, term271165.getClass(), "kopId", 724828471);
        setIntField(term271165, term271165.getClass(), "areaId", -1395142728);
        setIntField(term271165, term271165.getClass(), "totalTechScore", -783988653);
        setIntField(term271165, term271165.getClass(), "totalPlatinumScore", 1870111253);
        setField(term271165, term271165.getClass(), "techRecordDate", "DqctNOpAAG");
        setBooleanField(term271165, term271165.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term271165, args);
    }

};


