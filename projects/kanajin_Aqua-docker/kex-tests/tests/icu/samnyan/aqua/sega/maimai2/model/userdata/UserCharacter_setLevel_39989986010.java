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

public class UserCharacter_setLevel_39989986010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190862;
     Object term191223;

    public UserCharacter_setLevel_39989986010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term190868 = new Long(-2136893352275781569L);
        Integer term190931 = new Integer(665125325);
        Integer term190933 = new Integer(-1180829225);
        Integer term190935 = new Integer(-19961314);
        Integer term190937 = new Integer(903876999);
        Integer term190939 = new Integer(-20697214);
        Integer term190941 = new Integer(-374105961);
        Integer term190943 = new Integer(-198328789);
        ArrayList term190929 = new ArrayList();
        ((ArrayList) term190929).add(term190931);
        ((ArrayList) term190929).add(term190933);
        ((ArrayList) term190929).add(term190935);
        ((ArrayList) term190929).add(term190937);
        ((ArrayList) term190929).add(term190939);
        ((ArrayList) term190929).add(term190941);
        ((ArrayList) term190929).add(term190943);
        Integer term190949 = new Integer(-158694757);
        ArrayList term190947 = new ArrayList();
        ((ArrayList) term190947).add(term190949);
        term190862 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term190864 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term190866 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term190882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term190892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190897 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term190862, term190862.getClass(), "id", -9187541981442771351L);
        setLongField(term190864, term190864.getClass(), "id", 378406636775614740L);
        setLongField(term190866, term190866.getClass(), "id", 5961074363136430719L);
        setField(term190866, term190866.getClass(), "extId", term190868);
        setField(term190866, term190866.getClass(), "luid", "OGXxsmtsYU");
        setIntField(term190883, term190883.getClass(), "year", 2026);
        setShortField(term190883, term190883.getClass(), "month", (short) 12);
        setShortField(term190883, term190883.getClass(), "day", (short) 13);
        setField(term190882, term190882.getClass(), "date", term190883);
        setByteField(term190887, term190887.getClass(), "hour", (byte) 12);
        setByteField(term190887, term190887.getClass(), "minute", (byte) 7);
        setByteField(term190887, term190887.getClass(), "second", (byte) 52);
        setIntField(term190887, term190887.getClass(), "nano", 158332280);
        setField(term190882, term190882.getClass(), "time", term190887);
        setField(term190866, term190866.getClass(), "registerTime", term190882);
        setIntField(term190893, term190893.getClass(), "year", 2022);
        setShortField(term190893, term190893.getClass(), "month", (short) 4);
        setShortField(term190893, term190893.getClass(), "day", (short) 28);
        setField(term190892, term190892.getClass(), "date", term190893);
        setByteField(term190897, term190897.getClass(), "hour", (byte) 5);
        setByteField(term190897, term190897.getClass(), "minute", (byte) 17);
        setByteField(term190897, term190897.getClass(), "second", (byte) 39);
        setIntField(term190897, term190897.getClass(), "nano", 883798425);
        setField(term190892, term190892.getClass(), "time", term190897);
        setField(term190866, term190866.getClass(), "accessTime", term190892);
        setField(term190864, term190864.getClass(), "card", term190866);
        setField(term190864, term190864.getClass(), "userName", "mLKQCgJRhc");
        setIntField(term190864, term190864.getClass(), "isNetMember", -551874415);
        setIntField(term190864, term190864.getClass(), "iconId", -966624066);
        setIntField(term190864, term190864.getClass(), "plateId", -724561959);
        setIntField(term190864, term190864.getClass(), "titleId", 473971426);
        setIntField(term190864, term190864.getClass(), "partnerId", -1017341002);
        setIntField(term190864, term190864.getClass(), "frameId", -54592257);
        setIntField(term190864, term190864.getClass(), "selectMapId", -949100313);
        setIntField(term190864, term190864.getClass(), "totalAwake", -1081835094);
        setIntField(term190864, term190864.getClass(), "gradeRating", 1048568503);
        setIntField(term190864, term190864.getClass(), "musicRating", 1162032291);
        setIntField(term190864, term190864.getClass(), "playerRating", 2093059007);
        setIntField(term190864, term190864.getClass(), "highestRating", 372882015);
        setIntField(term190864, term190864.getClass(), "gradeRank", -1653385509);
        setIntField(term190864, term190864.getClass(), "classRank", 1135771983);
        setIntField(term190864, term190864.getClass(), "courseRank", 190828856);
        setField(term190864, term190864.getClass(), "charaSlot", term190929);
        setField(term190864, term190864.getClass(), "charaLockSlot", term190947);
        setLongField(term190864, term190864.getClass(), "contentBit", -1263670869958452903L);
        setIntField(term190864, term190864.getClass(), "playCount", 555694422);
        setField(term190864, term190864.getClass(), "eventWatchedDate", "FBrppwmmNJ");
        setField(term190864, term190864.getClass(), "lastGameId", "CEhIgioAkj");
        setField(term190864, term190864.getClass(), "lastRomVersion", "neItQnzSgh");
        setField(term190864, term190864.getClass(), "lastDataVersion", "nOSnYvTIMh");
        setField(term190864, term190864.getClass(), "lastLoginDate", "nlAaUzdWnd");
        setField(term190864, term190864.getClass(), "lastPlayDate", "flQJpSTTxh");
        setIntField(term190864, term190864.getClass(), "lastPlayCredit", -1555435028);
        setIntField(term190864, term190864.getClass(), "lastPlayMode", -1501344759);
        setIntField(term190864, term190864.getClass(), "lastPlaceId", -429485955);
        setField(term190864, term190864.getClass(), "lastPlaceName", "JyglsQuOkT");
        setIntField(term190864, term190864.getClass(), "lastAllNetId", -1666329424);
        setIntField(term190864, term190864.getClass(), "lastRegionId", -1283755218);
        setField(term190864, term190864.getClass(), "lastRegionName", "zBTpnippXR");
        setField(term190864, term190864.getClass(), "lastClientId", "xGyaHdnzGM");
        setField(term190864, term190864.getClass(), "lastCountryCode", "wbRekMnfmr");
        setIntField(term190864, term190864.getClass(), "lastSelectEMoney", -1544800993);
        setIntField(term190864, term190864.getClass(), "lastSelectTicket", 532107043);
        setIntField(term190864, term190864.getClass(), "lastSelectCourse", -1800024865);
        setIntField(term190864, term190864.getClass(), "lastCountCourse", 1555494796);
        setField(term190864, term190864.getClass(), "firstGameId", "hgaQCYedRy");
        setField(term190864, term190864.getClass(), "firstRomVersion", "OrqIIvDFfM");
        setField(term190864, term190864.getClass(), "firstDataVersion", "dmTuManhEg");
        setField(term190864, term190864.getClass(), "firstPlayDate", "fkGbNMnCKx");
        setField(term190864, term190864.getClass(), "compatibleCmVersion", "nrJryVhnJx");
        setField(term190864, term190864.getClass(), "dailyBonusDate", "BRFRCWtQIG");
        setField(term190864, term190864.getClass(), "dailyCourseBonusDate", "VvFHiCPutw");
        setField(term190864, term190864.getClass(), "lastPairLoginDate", "pIVDmquiiy");
        setField(term190864, term190864.getClass(), "lastTrialPlayDate", "QKZBoZqVRg");
        setIntField(term190864, term190864.getClass(), "playVsCount", -1304585657);
        setIntField(term190864, term190864.getClass(), "playSyncCount", 902409852);
        setIntField(term190864, term190864.getClass(), "winCount", 500447593);
        setIntField(term190864, term190864.getClass(), "helpCount", 206201108);
        setIntField(term190864, term190864.getClass(), "comboCount", -926229753);
        setLongField(term190864, term190864.getClass(), "totalDeluxscore", -5356866490534317541L);
        setLongField(term190864, term190864.getClass(), "totalBasicDeluxscore", 4109319711713641940L);
        setLongField(term190864, term190864.getClass(), "totalAdvancedDeluxscore", 8066632021341976980L);
        setLongField(term190864, term190864.getClass(), "totalExpertDeluxscore", 3361198376644316821L);
        setLongField(term190864, term190864.getClass(), "totalMasterDeluxscore", -2596368385325108340L);
        setLongField(term190864, term190864.getClass(), "totalReMasterDeluxscore", -9006683565777348144L);
        setIntField(term190864, term190864.getClass(), "totalSync", 245326381);
        setIntField(term190864, term190864.getClass(), "totalBasicSync", 122420715);
        setIntField(term190864, term190864.getClass(), "totalAdvancedSync", 190071205);
        setIntField(term190864, term190864.getClass(), "totalExpertSync", 2096693078);
        setIntField(term190864, term190864.getClass(), "totalMasterSync", 1474853885);
        setIntField(term190864, term190864.getClass(), "totalReMasterSync", 638225249);
        setLongField(term190864, term190864.getClass(), "totalAchievement", 6564495724575130929L);
        setLongField(term190864, term190864.getClass(), "totalBasicAchievement", -8620792848897119300L);
        setLongField(term190864, term190864.getClass(), "totalAdvancedAchievement", 9102003843549749951L);
        setLongField(term190864, term190864.getClass(), "totalExpertAchievement", 5989562756283635902L);
        setLongField(term190864, term190864.getClass(), "totalMasterAchievement", -4456338403298981816L);
        setLongField(term190864, term190864.getClass(), "totalReMasterAchievement", 3322189457255921095L);
        setLongField(term190864, term190864.getClass(), "playerOldRating", -7448875288248747337L);
        setLongField(term190864, term190864.getClass(), "playerNewRating", -7493334279992579335L);
        setIntField(term190864, term190864.getClass(), "banState", -669172505);
        setLongField(term190864, term190864.getClass(), "dateTime", 2722843198104900882L);
        setField(term190862, term190862.getClass(), "user", term190864);
        setIntField(term190862, term190862.getClass(), "characterId", 1077847171);
        setIntField(term190862, term190862.getClass(), "level", -167763728);
        setIntField(term190862, term190862.getClass(), "awakening", -413077084);
        setIntField(term190862, term190862.getClass(), "useCount", -2108615302);
        term191223 = new Integer(708531286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term191223;
        callMethod(klass, "setLevel", argTypes, term190862, args);
    }

};


