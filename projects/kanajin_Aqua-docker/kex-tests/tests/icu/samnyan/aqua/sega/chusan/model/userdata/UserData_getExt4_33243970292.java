package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getExt4_33243970292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284058;

    public UserData_getExt4_33243970292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284058 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term284058, term284058.getClass(), "id", 0L);
        setField(term284058, term284058.getClass(), "card", null);
        setField(term284058, term284058.getClass(), "userName", null);
        setIntField(term284058, term284058.getClass(), "level", 0);
        setIntField(term284058, term284058.getClass(), "reincarnationNum", 0);
        setField(term284058, term284058.getClass(), "exp", null);
        setLongField(term284058, term284058.getClass(), "point", 0L);
        setLongField(term284058, term284058.getClass(), "totalPoint", 0L);
        setIntField(term284058, term284058.getClass(), "playCount", 0);
        setIntField(term284058, term284058.getClass(), "multiPlayCount", 0);
        setIntField(term284058, term284058.getClass(), "playerRating", 0);
        setIntField(term284058, term284058.getClass(), "highestRating", 0);
        setIntField(term284058, term284058.getClass(), "nameplateId", 0);
        setIntField(term284058, term284058.getClass(), "frameId", 0);
        setIntField(term284058, term284058.getClass(), "characterId", 0);
        setIntField(term284058, term284058.getClass(), "trophyId", 0);
        setIntField(term284058, term284058.getClass(), "playedTutorialBit", 0);
        setIntField(term284058, term284058.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term284058, term284058.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term284058, term284058.getClass(), "totalMapNum", 0);
        setLongField(term284058, term284058.getClass(), "totalHiScore", 0L);
        setLongField(term284058, term284058.getClass(), "totalBasicHighScore", 0L);
        setLongField(term284058, term284058.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term284058, term284058.getClass(), "totalExpertHighScore", 0L);
        setLongField(term284058, term284058.getClass(), "totalMasterHighScore", 0L);
        setLongField(term284058, term284058.getClass(), "totalUltimaHighScore", 0L);
        setField(term284058, term284058.getClass(), "eventWatchedDate", null);
        setIntField(term284058, term284058.getClass(), "friendCount", 0);
        setField(term284058, term284058.getClass(), "firstGameId", null);
        setField(term284058, term284058.getClass(), "firstRomVersion", null);
        setField(term284058, term284058.getClass(), "firstDataVersion", null);
        setField(term284058, term284058.getClass(), "firstPlayDate", null);
        setField(term284058, term284058.getClass(), "lastGameId", null);
        setField(term284058, term284058.getClass(), "lastRomVersion", null);
        setField(term284058, term284058.getClass(), "lastDataVersion", null);
        setField(term284058, term284058.getClass(), "lastLoginDate", null);
        setField(term284058, term284058.getClass(), "lastPlayDate", null);
        setIntField(term284058, term284058.getClass(), "lastPlaceId", 0);
        setField(term284058, term284058.getClass(), "lastPlaceName", null);
        setField(term284058, term284058.getClass(), "lastRegionId", null);
        setField(term284058, term284058.getClass(), "lastRegionName", null);
        setField(term284058, term284058.getClass(), "lastAllNetId", null);
        setField(term284058, term284058.getClass(), "lastClientId", null);
        setField(term284058, term284058.getClass(), "lastCountryCode", null);
        setField(term284058, term284058.getClass(), "userNameEx", null);
        setField(term284058, term284058.getClass(), "compatibleCmVersion", null);
        setIntField(term284058, term284058.getClass(), "medal", 0);
        setIntField(term284058, term284058.getClass(), "mapIconId", 0);
        setIntField(term284058, term284058.getClass(), "voiceId", 0);
        setIntField(term284058, term284058.getClass(), "avatarWear", 0);
        setIntField(term284058, term284058.getClass(), "avatarHead", 0);
        setIntField(term284058, term284058.getClass(), "avatarFace", 0);
        setIntField(term284058, term284058.getClass(), "avatarSkin", 0);
        setIntField(term284058, term284058.getClass(), "avatarItem", 0);
        setIntField(term284058, term284058.getClass(), "avatarFront", 0);
        setIntField(term284058, term284058.getClass(), "avatarBack", 0);
        setIntField(term284058, term284058.getClass(), "classEmblemBase", 0);
        setIntField(term284058, term284058.getClass(), "classEmblemMedal", 0);
        setIntField(term284058, term284058.getClass(), "stockedGridCount", 0);
        setIntField(term284058, term284058.getClass(), "exMapLoopCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattlePlayCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattleWinCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattleLoseCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term284058, term284058.getClass(), "charaIllustId", 0);
        setIntField(term284058, term284058.getClass(), "skillId", 0);
        setIntField(term284058, term284058.getClass(), "overPowerPoint", 0);
        setIntField(term284058, term284058.getClass(), "overPowerRate", 0);
        setIntField(term284058, term284058.getClass(), "overPowerLowerRank", 0);
        setIntField(term284058, term284058.getClass(), "avatarPoint", 0);
        setIntField(term284058, term284058.getClass(), "battleRankId", 0);
        setIntField(term284058, term284058.getClass(), "battleRankPoint", 0);
        setIntField(term284058, term284058.getClass(), "eliteRankPoint", 0);
        setIntField(term284058, term284058.getClass(), "netBattle1stCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattle2ndCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattle3rdCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattle4thCount", 0);
        setIntField(term284058, term284058.getClass(), "netBattleCorrection", 0);
        setIntField(term284058, term284058.getClass(), "netBattleErrCnt", 0);
        setIntField(term284058, term284058.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term284058, term284058.getClass(), "battleRewardStatus", 0);
        setIntField(term284058, term284058.getClass(), "battleRewardIndex", 0);
        setIntField(term284058, term284058.getClass(), "battleRewardCount", 0);
        setIntField(term284058, term284058.getClass(), "ext1", 0);
        setIntField(term284058, term284058.getClass(), "ext2", 0);
        setIntField(term284058, term284058.getClass(), "ext3", 0);
        setIntField(term284058, term284058.getClass(), "ext4", 0);
        setIntField(term284058, term284058.getClass(), "ext5", 0);
        setIntField(term284058, term284058.getClass(), "ext6", 0);
        setIntField(term284058, term284058.getClass(), "ext7", 0);
        setIntField(term284058, term284058.getClass(), "ext8", 0);
        setIntField(term284058, term284058.getClass(), "ext9", 0);
        setIntField(term284058, term284058.getClass(), "ext10", 0);
        setField(term284058, term284058.getClass(), "extStr1", null);
        setField(term284058, term284058.getClass(), "extStr2", null);
        setLongField(term284058, term284058.getClass(), "extLong1", 0L);
        setLongField(term284058, term284058.getClass(), "extLong2", 0L);
        setField(term284058, term284058.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term284058, term284058.getClass(), "isNetBattleHost", false);
        setIntField(term284058, term284058.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt4", argTypes, term284058, args);
    }

};


