package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getTotalExpertDeluxscore_207758594858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228398;

    public UserDetail_getTotalExpertDeluxscore_207758594858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term228402 = new Long(4012955251407483889L);
        Integer term228465 = new Integer(130567867);
        Integer term228467 = new Integer(33782620);
        Integer term228469 = new Integer(-818766632);
        Integer term228471 = new Integer(45627161);
        Integer term228473 = new Integer(-206817101);
        Integer term228475 = new Integer(1541533024);
        Integer term228477 = new Integer(-1032828989);
        Integer term228479 = new Integer(-649944911);
        ArrayList term228463 = new ArrayList();
        ((ArrayList) term228463).add(term228465);
        ((ArrayList) term228463).add(term228467);
        ((ArrayList) term228463).add(term228469);
        ((ArrayList) term228463).add(term228471);
        ((ArrayList) term228463).add(term228473);
        ((ArrayList) term228463).add(term228475);
        ((ArrayList) term228463).add(term228477);
        ((ArrayList) term228463).add(term228479);
        Integer term228485 = new Integer(-1426067073);
        Integer term228487 = new Integer(-1679645192);
        Integer term228489 = new Integer(1524285721);
        ArrayList term228483 = new ArrayList();
        ((ArrayList) term228483).add(term228485);
        ((ArrayList) term228483).add(term228487);
        ((ArrayList) term228483).add(term228489);
        term228398 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term228400 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term228416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term228421 = newInstance(Class.forName("java.time.LocalTime"));
        Object term228426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term228427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term228431 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term228398, term228398.getClass(), "id", 2285382345856240863L);
        setLongField(term228400, term228400.getClass(), "id", 6680799276613605959L);
        setField(term228400, term228400.getClass(), "extId", term228402);
        setField(term228400, term228400.getClass(), "luid", "JKBkexwJQQ");
        setIntField(term228417, term228417.getClass(), "year", 2019);
        setShortField(term228417, term228417.getClass(), "month", (short) 10);
        setShortField(term228417, term228417.getClass(), "day", (short) 19);
        setField(term228416, term228416.getClass(), "date", term228417);
        setByteField(term228421, term228421.getClass(), "hour", (byte) 13);
        setByteField(term228421, term228421.getClass(), "minute", (byte) 22);
        setByteField(term228421, term228421.getClass(), "second", (byte) 53);
        setIntField(term228421, term228421.getClass(), "nano", 628070727);
        setField(term228416, term228416.getClass(), "time", term228421);
        setField(term228400, term228400.getClass(), "registerTime", term228416);
        setIntField(term228427, term228427.getClass(), "year", 2018);
        setShortField(term228427, term228427.getClass(), "month", (short) 3);
        setShortField(term228427, term228427.getClass(), "day", (short) 4);
        setField(term228426, term228426.getClass(), "date", term228427);
        setByteField(term228431, term228431.getClass(), "hour", (byte) 20);
        setByteField(term228431, term228431.getClass(), "minute", (byte) 47);
        setByteField(term228431, term228431.getClass(), "second", (byte) 55);
        setIntField(term228431, term228431.getClass(), "nano", 479898286);
        setField(term228426, term228426.getClass(), "time", term228431);
        setField(term228400, term228400.getClass(), "accessTime", term228426);
        setField(term228398, term228398.getClass(), "card", term228400);
        setField(term228398, term228398.getClass(), "userName", "GPXGjAdtoJ");
        setIntField(term228398, term228398.getClass(), "isNetMember", -1071514936);
        setIntField(term228398, term228398.getClass(), "iconId", 948646989);
        setIntField(term228398, term228398.getClass(), "plateId", -1091739087);
        setIntField(term228398, term228398.getClass(), "titleId", -436415220);
        setIntField(term228398, term228398.getClass(), "partnerId", -733438551);
        setIntField(term228398, term228398.getClass(), "frameId", 810630955);
        setIntField(term228398, term228398.getClass(), "selectMapId", -630134606);
        setIntField(term228398, term228398.getClass(), "totalAwake", -1976364009);
        setIntField(term228398, term228398.getClass(), "gradeRating", 1488533591);
        setIntField(term228398, term228398.getClass(), "musicRating", 1777759371);
        setIntField(term228398, term228398.getClass(), "playerRating", 2046454754);
        setIntField(term228398, term228398.getClass(), "highestRating", 1782403605);
        setIntField(term228398, term228398.getClass(), "gradeRank", 796551683);
        setIntField(term228398, term228398.getClass(), "classRank", 668463794);
        setIntField(term228398, term228398.getClass(), "courseRank", 1412866641);
        setField(term228398, term228398.getClass(), "charaSlot", term228463);
        setField(term228398, term228398.getClass(), "charaLockSlot", term228483);
        setLongField(term228398, term228398.getClass(), "contentBit", 3875820802428647785L);
        setIntField(term228398, term228398.getClass(), "playCount", 1177232469);
        setField(term228398, term228398.getClass(), "eventWatchedDate", "rpotsMWMJb");
        setField(term228398, term228398.getClass(), "lastGameId", "cZzZwgyRsb");
        setField(term228398, term228398.getClass(), "lastRomVersion", "yRTLQJvUab");
        setField(term228398, term228398.getClass(), "lastDataVersion", "uSsBnPkCNa");
        setField(term228398, term228398.getClass(), "lastLoginDate", "hGeOoQaXwC");
        setField(term228398, term228398.getClass(), "lastPlayDate", "ualEpwAGnm");
        setIntField(term228398, term228398.getClass(), "lastPlayCredit", 272511309);
        setIntField(term228398, term228398.getClass(), "lastPlayMode", 1932166997);
        setIntField(term228398, term228398.getClass(), "lastPlaceId", -1020349112);
        setField(term228398, term228398.getClass(), "lastPlaceName", "xYlQMsdTSy");
        setIntField(term228398, term228398.getClass(), "lastAllNetId", 1154843160);
        setIntField(term228398, term228398.getClass(), "lastRegionId", -499856155);
        setField(term228398, term228398.getClass(), "lastRegionName", "bCuxURZPHN");
        setField(term228398, term228398.getClass(), "lastClientId", "gHeEnrQkug");
        setField(term228398, term228398.getClass(), "lastCountryCode", "hHcuunhdDN");
        setIntField(term228398, term228398.getClass(), "lastSelectEMoney", 533179759);
        setIntField(term228398, term228398.getClass(), "lastSelectTicket", 1712114698);
        setIntField(term228398, term228398.getClass(), "lastSelectCourse", -1000527737);
        setIntField(term228398, term228398.getClass(), "lastCountCourse", -862289291);
        setField(term228398, term228398.getClass(), "firstGameId", "OWXMvkMqRq");
        setField(term228398, term228398.getClass(), "firstRomVersion", "cilVUGuAzp");
        setField(term228398, term228398.getClass(), "firstDataVersion", "DEGmRHMLsx");
        setField(term228398, term228398.getClass(), "firstPlayDate", "NpRJptUmML");
        setField(term228398, term228398.getClass(), "compatibleCmVersion", "UNUfwYHgBp");
        setField(term228398, term228398.getClass(), "dailyBonusDate", "muOBCWXlnl");
        setField(term228398, term228398.getClass(), "dailyCourseBonusDate", "kDvCVaiDrD");
        setField(term228398, term228398.getClass(), "lastPairLoginDate", "dyqwIzdzpi");
        setField(term228398, term228398.getClass(), "lastTrialPlayDate", "QQNYZIaGLG");
        setIntField(term228398, term228398.getClass(), "playVsCount", 1265374293);
        setIntField(term228398, term228398.getClass(), "playSyncCount", 1518831452);
        setIntField(term228398, term228398.getClass(), "winCount", -1281963546);
        setIntField(term228398, term228398.getClass(), "helpCount", 404778942);
        setIntField(term228398, term228398.getClass(), "comboCount", -2005990393);
        setLongField(term228398, term228398.getClass(), "totalDeluxscore", 885627014332734215L);
        setLongField(term228398, term228398.getClass(), "totalBasicDeluxscore", 1053668783363456491L);
        setLongField(term228398, term228398.getClass(), "totalAdvancedDeluxscore", 816349611483004758L);
        setLongField(term228398, term228398.getClass(), "totalExpertDeluxscore", 6334449203091770209L);
        setLongField(term228398, term228398.getClass(), "totalMasterDeluxscore", -2874074023279549309L);
        setLongField(term228398, term228398.getClass(), "totalReMasterDeluxscore", -720539725628116572L);
        setIntField(term228398, term228398.getClass(), "totalSync", -2037698232);
        setIntField(term228398, term228398.getClass(), "totalBasicSync", -257000438);
        setIntField(term228398, term228398.getClass(), "totalAdvancedSync", -1162950143);
        setIntField(term228398, term228398.getClass(), "totalExpertSync", 211497672);
        setIntField(term228398, term228398.getClass(), "totalMasterSync", -1763728099);
        setIntField(term228398, term228398.getClass(), "totalReMasterSync", 535763464);
        setLongField(term228398, term228398.getClass(), "totalAchievement", -9056433761226632106L);
        setLongField(term228398, term228398.getClass(), "totalBasicAchievement", -7685679100526197453L);
        setLongField(term228398, term228398.getClass(), "totalAdvancedAchievement", 7466644310571264628L);
        setLongField(term228398, term228398.getClass(), "totalExpertAchievement", -8835499959898956491L);
        setLongField(term228398, term228398.getClass(), "totalMasterAchievement", -4986925145460708345L);
        setLongField(term228398, term228398.getClass(), "totalReMasterAchievement", 5078180932363824574L);
        setLongField(term228398, term228398.getClass(), "playerOldRating", -3984389941033634402L);
        setLongField(term228398, term228398.getClass(), "playerNewRating", 4502595137064026705L);
        setIntField(term228398, term228398.getClass(), "banState", 369176479);
        setLongField(term228398, term228398.getClass(), "dateTime", 5799864894847820625L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertDeluxscore", argTypes, term228398, args);
    }

};


