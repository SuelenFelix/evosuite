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

public class UserData_getExtLong2_1125255492303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219429;

    public UserData_getExtLong2_1125255492303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219429 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4219429, term4219429.getClass(), "id", 0L);
        setField(term4219429, term4219429.getClass(), "card", null);
        setField(term4219429, term4219429.getClass(), "userName", null);
        setIntField(term4219429, term4219429.getClass(), "level", 0);
        setIntField(term4219429, term4219429.getClass(), "reincarnationNum", 0);
        setField(term4219429, term4219429.getClass(), "exp", null);
        setLongField(term4219429, term4219429.getClass(), "point", 0L);
        setLongField(term4219429, term4219429.getClass(), "totalPoint", 0L);
        setIntField(term4219429, term4219429.getClass(), "playCount", 0);
        setIntField(term4219429, term4219429.getClass(), "multiPlayCount", 0);
        setIntField(term4219429, term4219429.getClass(), "playerRating", 0);
        setIntField(term4219429, term4219429.getClass(), "highestRating", 0);
        setIntField(term4219429, term4219429.getClass(), "nameplateId", 0);
        setIntField(term4219429, term4219429.getClass(), "frameId", 0);
        setIntField(term4219429, term4219429.getClass(), "characterId", 0);
        setIntField(term4219429, term4219429.getClass(), "trophyId", 0);
        setIntField(term4219429, term4219429.getClass(), "playedTutorialBit", 0);
        setIntField(term4219429, term4219429.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4219429, term4219429.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4219429, term4219429.getClass(), "totalMapNum", 0);
        setLongField(term4219429, term4219429.getClass(), "totalHiScore", 0L);
        setLongField(term4219429, term4219429.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4219429, term4219429.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4219429, term4219429.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4219429, term4219429.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4219429, term4219429.getClass(), "totalUltimaHighScore", 0L);
        setField(term4219429, term4219429.getClass(), "eventWatchedDate", null);
        setIntField(term4219429, term4219429.getClass(), "friendCount", 0);
        setField(term4219429, term4219429.getClass(), "firstGameId", null);
        setField(term4219429, term4219429.getClass(), "firstRomVersion", null);
        setField(term4219429, term4219429.getClass(), "firstDataVersion", null);
        setField(term4219429, term4219429.getClass(), "firstPlayDate", null);
        setField(term4219429, term4219429.getClass(), "lastGameId", null);
        setField(term4219429, term4219429.getClass(), "lastRomVersion", null);
        setField(term4219429, term4219429.getClass(), "lastDataVersion", null);
        setField(term4219429, term4219429.getClass(), "lastLoginDate", null);
        setField(term4219429, term4219429.getClass(), "lastPlayDate", null);
        setIntField(term4219429, term4219429.getClass(), "lastPlaceId", 0);
        setField(term4219429, term4219429.getClass(), "lastPlaceName", null);
        setField(term4219429, term4219429.getClass(), "lastRegionId", null);
        setField(term4219429, term4219429.getClass(), "lastRegionName", null);
        setField(term4219429, term4219429.getClass(), "lastAllNetId", null);
        setField(term4219429, term4219429.getClass(), "lastClientId", null);
        setField(term4219429, term4219429.getClass(), "lastCountryCode", null);
        setField(term4219429, term4219429.getClass(), "userNameEx", null);
        setField(term4219429, term4219429.getClass(), "compatibleCmVersion", null);
        setIntField(term4219429, term4219429.getClass(), "medal", 0);
        setIntField(term4219429, term4219429.getClass(), "mapIconId", 0);
        setIntField(term4219429, term4219429.getClass(), "voiceId", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarWear", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarHead", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarFace", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarSkin", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarItem", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarFront", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarBack", 0);
        setIntField(term4219429, term4219429.getClass(), "classEmblemBase", 0);
        setIntField(term4219429, term4219429.getClass(), "classEmblemMedal", 0);
        setIntField(term4219429, term4219429.getClass(), "stockedGridCount", 0);
        setIntField(term4219429, term4219429.getClass(), "exMapLoopCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattlePlayCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattleWinCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattleLoseCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4219429, term4219429.getClass(), "charaIllustId", 0);
        setIntField(term4219429, term4219429.getClass(), "skillId", 0);
        setIntField(term4219429, term4219429.getClass(), "overPowerPoint", 0);
        setIntField(term4219429, term4219429.getClass(), "overPowerRate", 0);
        setIntField(term4219429, term4219429.getClass(), "overPowerLowerRank", 0);
        setIntField(term4219429, term4219429.getClass(), "avatarPoint", 0);
        setIntField(term4219429, term4219429.getClass(), "battleRankId", 0);
        setIntField(term4219429, term4219429.getClass(), "battleRankPoint", 0);
        setIntField(term4219429, term4219429.getClass(), "eliteRankPoint", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattle1stCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattle2ndCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattle3rdCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattle4thCount", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattleCorrection", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattleErrCnt", 0);
        setIntField(term4219429, term4219429.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4219429, term4219429.getClass(), "battleRewardStatus", 0);
        setIntField(term4219429, term4219429.getClass(), "battleRewardIndex", 0);
        setIntField(term4219429, term4219429.getClass(), "battleRewardCount", 0);
        setIntField(term4219429, term4219429.getClass(), "ext1", 0);
        setIntField(term4219429, term4219429.getClass(), "ext2", 0);
        setIntField(term4219429, term4219429.getClass(), "ext3", 0);
        setIntField(term4219429, term4219429.getClass(), "ext4", 0);
        setIntField(term4219429, term4219429.getClass(), "ext5", 0);
        setIntField(term4219429, term4219429.getClass(), "ext6", 0);
        setIntField(term4219429, term4219429.getClass(), "ext7", 0);
        setIntField(term4219429, term4219429.getClass(), "ext8", 0);
        setIntField(term4219429, term4219429.getClass(), "ext9", 0);
        setIntField(term4219429, term4219429.getClass(), "ext10", 0);
        setField(term4219429, term4219429.getClass(), "extStr1", null);
        setField(term4219429, term4219429.getClass(), "extStr2", null);
        setLongField(term4219429, term4219429.getClass(), "extLong1", 0L);
        setLongField(term4219429, term4219429.getClass(), "extLong2", 0L);
        setField(term4219429, term4219429.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4219429, term4219429.getClass(), "isNetBattleHost", false);
        setIntField(term4219429, term4219429.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtLong2", argTypes, term4219429, args);
    }

};


