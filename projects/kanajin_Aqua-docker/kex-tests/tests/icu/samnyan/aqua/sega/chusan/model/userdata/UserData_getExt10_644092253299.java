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

public class UserData_getExt10_644092253299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4219121;

    public UserData_getExt10_644092253299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4219121 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4219121, term4219121.getClass(), "id", 0L);
        setField(term4219121, term4219121.getClass(), "card", null);
        setField(term4219121, term4219121.getClass(), "userName", null);
        setIntField(term4219121, term4219121.getClass(), "level", 0);
        setIntField(term4219121, term4219121.getClass(), "reincarnationNum", 0);
        setField(term4219121, term4219121.getClass(), "exp", null);
        setLongField(term4219121, term4219121.getClass(), "point", 0L);
        setLongField(term4219121, term4219121.getClass(), "totalPoint", 0L);
        setIntField(term4219121, term4219121.getClass(), "playCount", 0);
        setIntField(term4219121, term4219121.getClass(), "multiPlayCount", 0);
        setIntField(term4219121, term4219121.getClass(), "playerRating", 0);
        setIntField(term4219121, term4219121.getClass(), "highestRating", 0);
        setIntField(term4219121, term4219121.getClass(), "nameplateId", 0);
        setIntField(term4219121, term4219121.getClass(), "frameId", 0);
        setIntField(term4219121, term4219121.getClass(), "characterId", 0);
        setIntField(term4219121, term4219121.getClass(), "trophyId", 0);
        setIntField(term4219121, term4219121.getClass(), "playedTutorialBit", 0);
        setIntField(term4219121, term4219121.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4219121, term4219121.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4219121, term4219121.getClass(), "totalMapNum", 0);
        setLongField(term4219121, term4219121.getClass(), "totalHiScore", 0L);
        setLongField(term4219121, term4219121.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4219121, term4219121.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4219121, term4219121.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4219121, term4219121.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4219121, term4219121.getClass(), "totalUltimaHighScore", 0L);
        setField(term4219121, term4219121.getClass(), "eventWatchedDate", null);
        setIntField(term4219121, term4219121.getClass(), "friendCount", 0);
        setField(term4219121, term4219121.getClass(), "firstGameId", null);
        setField(term4219121, term4219121.getClass(), "firstRomVersion", null);
        setField(term4219121, term4219121.getClass(), "firstDataVersion", null);
        setField(term4219121, term4219121.getClass(), "firstPlayDate", null);
        setField(term4219121, term4219121.getClass(), "lastGameId", null);
        setField(term4219121, term4219121.getClass(), "lastRomVersion", null);
        setField(term4219121, term4219121.getClass(), "lastDataVersion", null);
        setField(term4219121, term4219121.getClass(), "lastLoginDate", null);
        setField(term4219121, term4219121.getClass(), "lastPlayDate", null);
        setIntField(term4219121, term4219121.getClass(), "lastPlaceId", 0);
        setField(term4219121, term4219121.getClass(), "lastPlaceName", null);
        setField(term4219121, term4219121.getClass(), "lastRegionId", null);
        setField(term4219121, term4219121.getClass(), "lastRegionName", null);
        setField(term4219121, term4219121.getClass(), "lastAllNetId", null);
        setField(term4219121, term4219121.getClass(), "lastClientId", null);
        setField(term4219121, term4219121.getClass(), "lastCountryCode", null);
        setField(term4219121, term4219121.getClass(), "userNameEx", null);
        setField(term4219121, term4219121.getClass(), "compatibleCmVersion", null);
        setIntField(term4219121, term4219121.getClass(), "medal", 0);
        setIntField(term4219121, term4219121.getClass(), "mapIconId", 0);
        setIntField(term4219121, term4219121.getClass(), "voiceId", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarWear", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarHead", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarFace", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarSkin", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarItem", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarFront", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarBack", 0);
        setIntField(term4219121, term4219121.getClass(), "classEmblemBase", 0);
        setIntField(term4219121, term4219121.getClass(), "classEmblemMedal", 0);
        setIntField(term4219121, term4219121.getClass(), "stockedGridCount", 0);
        setIntField(term4219121, term4219121.getClass(), "exMapLoopCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattlePlayCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattleWinCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattleLoseCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4219121, term4219121.getClass(), "charaIllustId", 0);
        setIntField(term4219121, term4219121.getClass(), "skillId", 0);
        setIntField(term4219121, term4219121.getClass(), "overPowerPoint", 0);
        setIntField(term4219121, term4219121.getClass(), "overPowerRate", 0);
        setIntField(term4219121, term4219121.getClass(), "overPowerLowerRank", 0);
        setIntField(term4219121, term4219121.getClass(), "avatarPoint", 0);
        setIntField(term4219121, term4219121.getClass(), "battleRankId", 0);
        setIntField(term4219121, term4219121.getClass(), "battleRankPoint", 0);
        setIntField(term4219121, term4219121.getClass(), "eliteRankPoint", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattle1stCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattle2ndCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattle3rdCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattle4thCount", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattleCorrection", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattleErrCnt", 0);
        setIntField(term4219121, term4219121.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4219121, term4219121.getClass(), "battleRewardStatus", 0);
        setIntField(term4219121, term4219121.getClass(), "battleRewardIndex", 0);
        setIntField(term4219121, term4219121.getClass(), "battleRewardCount", 0);
        setIntField(term4219121, term4219121.getClass(), "ext1", 0);
        setIntField(term4219121, term4219121.getClass(), "ext2", 0);
        setIntField(term4219121, term4219121.getClass(), "ext3", 0);
        setIntField(term4219121, term4219121.getClass(), "ext4", 0);
        setIntField(term4219121, term4219121.getClass(), "ext5", 0);
        setIntField(term4219121, term4219121.getClass(), "ext6", 0);
        setIntField(term4219121, term4219121.getClass(), "ext7", 0);
        setIntField(term4219121, term4219121.getClass(), "ext8", 0);
        setIntField(term4219121, term4219121.getClass(), "ext9", 0);
        setIntField(term4219121, term4219121.getClass(), "ext10", 0);
        setField(term4219121, term4219121.getClass(), "extStr1", null);
        setField(term4219121, term4219121.getClass(), "extStr2", null);
        setLongField(term4219121, term4219121.getClass(), "extLong1", 0L);
        setLongField(term4219121, term4219121.getClass(), "extLong2", 0L);
        setField(term4219121, term4219121.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4219121, term4219121.getClass(), "isNetBattleHost", false);
        setIntField(term4219121, term4219121.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt10", argTypes, term4219121, args);
    }

};


