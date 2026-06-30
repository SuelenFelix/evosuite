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

public class UserEventPoint_setPoint_20607396549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385820;
     Object term386088;

    public UserEventPoint_setPoint_20607396549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term385826 = new Long(-4821516944173509228L);
        term385820 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term385822 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term385824 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term385840 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term385841 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385845 = newInstance(Class.forName("java.time.LocalTime"));
        Object term385850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term385851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385855 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term385820, term385820.getClass(), "id", -1535582794237397820L);
        setLongField(term385822, term385822.getClass(), "id", 6499549656577408660L);
        setLongField(term385824, term385824.getClass(), "id", 2388089406848809898L);
        setField(term385824, term385824.getClass(), "extId", term385826);
        setField(term385824, term385824.getClass(), "luid", "IuhLjYeBBu");
        setIntField(term385841, term385841.getClass(), "year", 2019);
        setShortField(term385841, term385841.getClass(), "month", (short) 5);
        setShortField(term385841, term385841.getClass(), "day", (short) 11);
        setField(term385840, term385840.getClass(), "date", term385841);
        setByteField(term385845, term385845.getClass(), "hour", (byte) 17);
        setByteField(term385845, term385845.getClass(), "minute", (byte) 11);
        setByteField(term385845, term385845.getClass(), "second", (byte) 40);
        setIntField(term385845, term385845.getClass(), "nano", 538230479);
        setField(term385840, term385840.getClass(), "time", term385845);
        setField(term385824, term385824.getClass(), "registerTime", term385840);
        setIntField(term385851, term385851.getClass(), "year", 2018);
        setShortField(term385851, term385851.getClass(), "month", (short) 1);
        setShortField(term385851, term385851.getClass(), "day", (short) 2);
        setField(term385850, term385850.getClass(), "date", term385851);
        setByteField(term385855, term385855.getClass(), "hour", (byte) 1);
        setByteField(term385855, term385855.getClass(), "minute", (byte) 25);
        setByteField(term385855, term385855.getClass(), "second", (byte) 43);
        setIntField(term385855, term385855.getClass(), "nano", 801064102);
        setField(term385850, term385850.getClass(), "time", term385855);
        setField(term385824, term385824.getClass(), "accessTime", term385850);
        setField(term385822, term385822.getClass(), "card", term385824);
        setField(term385822, term385822.getClass(), "userName", "jjagiNVCxO");
        setIntField(term385822, term385822.getClass(), "level", 283735063);
        setIntField(term385822, term385822.getClass(), "reincarnationNum", 2121778076);
        setLongField(term385822, term385822.getClass(), "exp", -1678434145789674808L);
        setLongField(term385822, term385822.getClass(), "point", -7569615609002606525L);
        setLongField(term385822, term385822.getClass(), "totalPoint", 2240661467720686109L);
        setIntField(term385822, term385822.getClass(), "playCount", -2086046185);
        setIntField(term385822, term385822.getClass(), "jewelCount", -1670318441);
        setIntField(term385822, term385822.getClass(), "totalJewelCount", -77814214);
        setIntField(term385822, term385822.getClass(), "medalCount", -556152200);
        setIntField(term385822, term385822.getClass(), "playerRating", 2088464823);
        setIntField(term385822, term385822.getClass(), "highestRating", -128932205);
        setIntField(term385822, term385822.getClass(), "battlePoint", 1468076431);
        setIntField(term385822, term385822.getClass(), "bestBattlePoint", 443915973);
        setIntField(term385822, term385822.getClass(), "overDamageBattlePoint", 558340992);
        setBooleanField(term385822, term385822.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term385822, term385822.getClass(), "nameplateId", 1075013267);
        setIntField(term385822, term385822.getClass(), "trophyId", -538932788);
        setIntField(term385822, term385822.getClass(), "cardId", -446285065);
        setIntField(term385822, term385822.getClass(), "characterId", -285322651);
        setIntField(term385822, term385822.getClass(), "characterVoiceNo", 212853966);
        setIntField(term385822, term385822.getClass(), "tabSetting", 5696820);
        setIntField(term385822, term385822.getClass(), "tabSortSetting", 1589693437);
        setIntField(term385822, term385822.getClass(), "cardCategorySetting", 5759640);
        setIntField(term385822, term385822.getClass(), "cardSortSetting", 1376547782);
        setIntField(term385822, term385822.getClass(), "rivalScoreCategorySetting", -2072185266);
        setIntField(term385822, term385822.getClass(), "playedTutorialBit", -1234717973);
        setIntField(term385822, term385822.getClass(), "firstTutorialCancelNum", -145387424);
        setLongField(term385822, term385822.getClass(), "sumTechHighScore", -7738511915449071115L);
        setLongField(term385822, term385822.getClass(), "sumTechBasicHighScore", 4947789678146608888L);
        setLongField(term385822, term385822.getClass(), "sumTechAdvancedHighScore", -4431435602838599106L);
        setLongField(term385822, term385822.getClass(), "sumTechExpertHighScore", 4248917068721406513L);
        setLongField(term385822, term385822.getClass(), "sumTechMasterHighScore", 5352947087195389431L);
        setLongField(term385822, term385822.getClass(), "sumTechLunaticHighScore", 4655931432836005877L);
        setLongField(term385822, term385822.getClass(), "sumBattleHighScore", 2822111493564079836L);
        setLongField(term385822, term385822.getClass(), "sumBattleBasicHighScore", -4900145400929104148L);
        setLongField(term385822, term385822.getClass(), "sumBattleAdvancedHighScore", -2012996835164886709L);
        setLongField(term385822, term385822.getClass(), "sumBattleExpertHighScore", -736210715820137059L);
        setLongField(term385822, term385822.getClass(), "sumBattleMasterHighScore", 8083079363020274251L);
        setLongField(term385822, term385822.getClass(), "sumBattleLunaticHighScore", -169210266079301103L);
        setField(term385822, term385822.getClass(), "eventWatchedDate", "CsPveZMVYI");
        setField(term385822, term385822.getClass(), "cmEventWatchedDate", "uWdAwmLCDz");
        setField(term385822, term385822.getClass(), "firstGameId", "ylgxITCFrX");
        setField(term385822, term385822.getClass(), "firstRomVersion", "hIdhYVTfoZ");
        setField(term385822, term385822.getClass(), "firstDataVersion", "aupJpKqKcf");
        setField(term385822, term385822.getClass(), "firstPlayDate", "dknLJvnRcg");
        setField(term385822, term385822.getClass(), "lastGameId", "tJWQtgsHtL");
        setField(term385822, term385822.getClass(), "lastRomVersion", "tKkOPySOaJ");
        setField(term385822, term385822.getClass(), "lastDataVersion", "qsnUbGkEMB");
        setField(term385822, term385822.getClass(), "compatibleCmVersion", "lrThWfdouN");
        setField(term385822, term385822.getClass(), "lastPlayDate", "YhkMetixGm");
        setIntField(term385822, term385822.getClass(), "lastPlaceId", -1910825336);
        setField(term385822, term385822.getClass(), "lastPlaceName", "daNUfPbtEt");
        setIntField(term385822, term385822.getClass(), "lastRegionId", -2021526313);
        setField(term385822, term385822.getClass(), "lastRegionName", "jtvOBhInvx");
        setIntField(term385822, term385822.getClass(), "lastAllNetId", 31030488);
        setField(term385822, term385822.getClass(), "lastClientId", "AxByhjLrpp");
        setIntField(term385822, term385822.getClass(), "lastUsedDeckId", -901252048);
        setIntField(term385822, term385822.getClass(), "lastPlayMusicLevel", 1827421490);
        setIntField(term385822, term385822.getClass(), "lastEmoneyBrand", 1664328184);
        setField(term385820, term385820.getClass(), "user", term385822);
        setIntField(term385820, term385820.getClass(), "eventId", -1021512439);
        setLongField(term385820, term385820.getClass(), "point", -6151604934208796208L);
        setBooleanField(term385820, term385820.getClass(), "isRankingRewarded", false);
        term386088 = new Long(2530720747008616374L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term386088;
        callMethod(klass, "setPoint", argTypes, term385820, args);
    }

};


