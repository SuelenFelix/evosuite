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

public class UserTechEvent_isTotalTechNewRecord_17331919078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354734;

    public UserTechEvent_isTotalTechNewRecord_17331919078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term354740 = new Long(5646422912118770408L);
        term354734 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term354736 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term354738 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term354754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term354755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term354759 = newInstance(Class.forName("java.time.LocalTime"));
        Object term354764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term354765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term354769 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term354734, term354734.getClass(), "id", 3541535781197500942L);
        setLongField(term354736, term354736.getClass(), "id", -3678193349403274036L);
        setLongField(term354738, term354738.getClass(), "id", 1950699129101053880L);
        setField(term354738, term354738.getClass(), "extId", term354740);
        setField(term354738, term354738.getClass(), "luid", "fXpiCxZhVX");
        setIntField(term354755, term354755.getClass(), "year", 2017);
        setShortField(term354755, term354755.getClass(), "month", (short) 7);
        setShortField(term354755, term354755.getClass(), "day", (short) 1);
        setField(term354754, term354754.getClass(), "date", term354755);
        setByteField(term354759, term354759.getClass(), "hour", (byte) 10);
        setByteField(term354759, term354759.getClass(), "minute", (byte) 19);
        setByteField(term354759, term354759.getClass(), "second", (byte) 58);
        setIntField(term354759, term354759.getClass(), "nano", 653322054);
        setField(term354754, term354754.getClass(), "time", term354759);
        setField(term354738, term354738.getClass(), "registerTime", term354754);
        setIntField(term354765, term354765.getClass(), "year", 2017);
        setShortField(term354765, term354765.getClass(), "month", (short) 9);
        setShortField(term354765, term354765.getClass(), "day", (short) 6);
        setField(term354764, term354764.getClass(), "date", term354765);
        setByteField(term354769, term354769.getClass(), "hour", (byte) 2);
        setByteField(term354769, term354769.getClass(), "minute", (byte) 12);
        setByteField(term354769, term354769.getClass(), "second", (byte) 32);
        setIntField(term354769, term354769.getClass(), "nano", 373767065);
        setField(term354764, term354764.getClass(), "time", term354769);
        setField(term354738, term354738.getClass(), "accessTime", term354764);
        setField(term354736, term354736.getClass(), "card", term354738);
        setField(term354736, term354736.getClass(), "userName", "RoAZlLncfw");
        setIntField(term354736, term354736.getClass(), "level", -29526939);
        setIntField(term354736, term354736.getClass(), "reincarnationNum", 300379328);
        setLongField(term354736, term354736.getClass(), "exp", 3818323198845611431L);
        setLongField(term354736, term354736.getClass(), "point", 5155502422651484029L);
        setLongField(term354736, term354736.getClass(), "totalPoint", 5002943401906368192L);
        setIntField(term354736, term354736.getClass(), "playCount", 1134407225);
        setIntField(term354736, term354736.getClass(), "jewelCount", -1280390768);
        setIntField(term354736, term354736.getClass(), "totalJewelCount", -1033413141);
        setIntField(term354736, term354736.getClass(), "medalCount", -1965312295);
        setIntField(term354736, term354736.getClass(), "playerRating", -1214428897);
        setIntField(term354736, term354736.getClass(), "highestRating", 1993985640);
        setIntField(term354736, term354736.getClass(), "battlePoint", -651806682);
        setIntField(term354736, term354736.getClass(), "bestBattlePoint", -565456226);
        setIntField(term354736, term354736.getClass(), "overDamageBattlePoint", -242319054);
        setBooleanField(term354736, term354736.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term354736, term354736.getClass(), "nameplateId", 56723510);
        setIntField(term354736, term354736.getClass(), "trophyId", -485106720);
        setIntField(term354736, term354736.getClass(), "cardId", -1273264309);
        setIntField(term354736, term354736.getClass(), "characterId", 1547349648);
        setIntField(term354736, term354736.getClass(), "characterVoiceNo", -609059585);
        setIntField(term354736, term354736.getClass(), "tabSetting", 1054746926);
        setIntField(term354736, term354736.getClass(), "tabSortSetting", -909284296);
        setIntField(term354736, term354736.getClass(), "cardCategorySetting", -1099231922);
        setIntField(term354736, term354736.getClass(), "cardSortSetting", 813019973);
        setIntField(term354736, term354736.getClass(), "rivalScoreCategorySetting", -450164269);
        setIntField(term354736, term354736.getClass(), "playedTutorialBit", 1500628335);
        setIntField(term354736, term354736.getClass(), "firstTutorialCancelNum", 1502191735);
        setLongField(term354736, term354736.getClass(), "sumTechHighScore", -1744291915111794393L);
        setLongField(term354736, term354736.getClass(), "sumTechBasicHighScore", 78074805999841175L);
        setLongField(term354736, term354736.getClass(), "sumTechAdvancedHighScore", -8746609171253269200L);
        setLongField(term354736, term354736.getClass(), "sumTechExpertHighScore", -167256588262297780L);
        setLongField(term354736, term354736.getClass(), "sumTechMasterHighScore", -2845334017794841173L);
        setLongField(term354736, term354736.getClass(), "sumTechLunaticHighScore", -8429625606974223844L);
        setLongField(term354736, term354736.getClass(), "sumBattleHighScore", -3902993153017042589L);
        setLongField(term354736, term354736.getClass(), "sumBattleBasicHighScore", 3476531897765659435L);
        setLongField(term354736, term354736.getClass(), "sumBattleAdvancedHighScore", 2477367990446218564L);
        setLongField(term354736, term354736.getClass(), "sumBattleExpertHighScore", 7373738582145410691L);
        setLongField(term354736, term354736.getClass(), "sumBattleMasterHighScore", 7748047374734729209L);
        setLongField(term354736, term354736.getClass(), "sumBattleLunaticHighScore", 4920122685196142428L);
        setField(term354736, term354736.getClass(), "eventWatchedDate", "ihQKkNrjfo");
        setField(term354736, term354736.getClass(), "cmEventWatchedDate", "vvcNNVYxJR");
        setField(term354736, term354736.getClass(), "firstGameId", "SxngmvgbAq");
        setField(term354736, term354736.getClass(), "firstRomVersion", "KfnWRiJyeL");
        setField(term354736, term354736.getClass(), "firstDataVersion", "PIGcpPcptY");
        setField(term354736, term354736.getClass(), "firstPlayDate", "MWeDtBNyeq");
        setField(term354736, term354736.getClass(), "lastGameId", "XoKgFYSBpp");
        setField(term354736, term354736.getClass(), "lastRomVersion", "zXmaRNozSp");
        setField(term354736, term354736.getClass(), "lastDataVersion", "ZGoPwMXckx");
        setField(term354736, term354736.getClass(), "compatibleCmVersion", "ziVzzfsjal");
        setField(term354736, term354736.getClass(), "lastPlayDate", "dWvBvOwlDO");
        setIntField(term354736, term354736.getClass(), "lastPlaceId", 883356350);
        setField(term354736, term354736.getClass(), "lastPlaceName", "zAhEmpLiNz");
        setIntField(term354736, term354736.getClass(), "lastRegionId", -231229977);
        setField(term354736, term354736.getClass(), "lastRegionName", "kkaXeHtcls");
        setIntField(term354736, term354736.getClass(), "lastAllNetId", 1221465470);
        setField(term354736, term354736.getClass(), "lastClientId", "mNRRBiGVkF");
        setIntField(term354736, term354736.getClass(), "lastUsedDeckId", -783367851);
        setIntField(term354736, term354736.getClass(), "lastPlayMusicLevel", -1073619898);
        setIntField(term354736, term354736.getClass(), "lastEmoneyBrand", 2125930163);
        setField(term354734, term354734.getClass(), "user", term354736);
        setIntField(term354734, term354734.getClass(), "eventId", -1769244531);
        setIntField(term354734, term354734.getClass(), "totalTechScore", -1654530322);
        setIntField(term354734, term354734.getClass(), "totalPlatinumScore", 504630549);
        setField(term354734, term354734.getClass(), "techRecordDate", "rUwIEZNDpn");
        setBooleanField(term354734, term354734.getClass(), "isRankingRewarded", true);
        setBooleanField(term354734, term354734.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTotalTechNewRecord", argTypes, term354734, args);
    }

};


