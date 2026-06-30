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

public class UserData_getLevel_732966183209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277667;

    public UserData_getLevel_732966183209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277667 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term277667, term277667.getClass(), "id", 0L);
        setField(term277667, term277667.getClass(), "card", null);
        setField(term277667, term277667.getClass(), "userName", null);
        setIntField(term277667, term277667.getClass(), "level", 0);
        setIntField(term277667, term277667.getClass(), "reincarnationNum", 0);
        setField(term277667, term277667.getClass(), "exp", null);
        setLongField(term277667, term277667.getClass(), "point", 0L);
        setLongField(term277667, term277667.getClass(), "totalPoint", 0L);
        setIntField(term277667, term277667.getClass(), "playCount", 0);
        setIntField(term277667, term277667.getClass(), "multiPlayCount", 0);
        setIntField(term277667, term277667.getClass(), "playerRating", 0);
        setIntField(term277667, term277667.getClass(), "highestRating", 0);
        setIntField(term277667, term277667.getClass(), "nameplateId", 0);
        setIntField(term277667, term277667.getClass(), "frameId", 0);
        setIntField(term277667, term277667.getClass(), "characterId", 0);
        setIntField(term277667, term277667.getClass(), "trophyId", 0);
        setIntField(term277667, term277667.getClass(), "playedTutorialBit", 0);
        setIntField(term277667, term277667.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term277667, term277667.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term277667, term277667.getClass(), "totalMapNum", 0);
        setLongField(term277667, term277667.getClass(), "totalHiScore", 0L);
        setLongField(term277667, term277667.getClass(), "totalBasicHighScore", 0L);
        setLongField(term277667, term277667.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term277667, term277667.getClass(), "totalExpertHighScore", 0L);
        setLongField(term277667, term277667.getClass(), "totalMasterHighScore", 0L);
        setLongField(term277667, term277667.getClass(), "totalUltimaHighScore", 0L);
        setField(term277667, term277667.getClass(), "eventWatchedDate", null);
        setIntField(term277667, term277667.getClass(), "friendCount", 0);
        setField(term277667, term277667.getClass(), "firstGameId", null);
        setField(term277667, term277667.getClass(), "firstRomVersion", null);
        setField(term277667, term277667.getClass(), "firstDataVersion", null);
        setField(term277667, term277667.getClass(), "firstPlayDate", null);
        setField(term277667, term277667.getClass(), "lastGameId", null);
        setField(term277667, term277667.getClass(), "lastRomVersion", null);
        setField(term277667, term277667.getClass(), "lastDataVersion", null);
        setField(term277667, term277667.getClass(), "lastLoginDate", null);
        setField(term277667, term277667.getClass(), "lastPlayDate", null);
        setIntField(term277667, term277667.getClass(), "lastPlaceId", 0);
        setField(term277667, term277667.getClass(), "lastPlaceName", null);
        setField(term277667, term277667.getClass(), "lastRegionId", null);
        setField(term277667, term277667.getClass(), "lastRegionName", null);
        setField(term277667, term277667.getClass(), "lastAllNetId", null);
        setField(term277667, term277667.getClass(), "lastClientId", null);
        setField(term277667, term277667.getClass(), "lastCountryCode", null);
        setField(term277667, term277667.getClass(), "userNameEx", null);
        setField(term277667, term277667.getClass(), "compatibleCmVersion", null);
        setIntField(term277667, term277667.getClass(), "medal", 0);
        setIntField(term277667, term277667.getClass(), "mapIconId", 0);
        setIntField(term277667, term277667.getClass(), "voiceId", 0);
        setIntField(term277667, term277667.getClass(), "avatarWear", 0);
        setIntField(term277667, term277667.getClass(), "avatarHead", 0);
        setIntField(term277667, term277667.getClass(), "avatarFace", 0);
        setIntField(term277667, term277667.getClass(), "avatarSkin", 0);
        setIntField(term277667, term277667.getClass(), "avatarItem", 0);
        setIntField(term277667, term277667.getClass(), "avatarFront", 0);
        setIntField(term277667, term277667.getClass(), "avatarBack", 0);
        setIntField(term277667, term277667.getClass(), "classEmblemBase", 0);
        setIntField(term277667, term277667.getClass(), "classEmblemMedal", 0);
        setIntField(term277667, term277667.getClass(), "stockedGridCount", 0);
        setIntField(term277667, term277667.getClass(), "exMapLoopCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattlePlayCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattleWinCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattleLoseCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term277667, term277667.getClass(), "charaIllustId", 0);
        setIntField(term277667, term277667.getClass(), "skillId", 0);
        setIntField(term277667, term277667.getClass(), "overPowerPoint", 0);
        setIntField(term277667, term277667.getClass(), "overPowerRate", 0);
        setIntField(term277667, term277667.getClass(), "overPowerLowerRank", 0);
        setIntField(term277667, term277667.getClass(), "avatarPoint", 0);
        setIntField(term277667, term277667.getClass(), "battleRankId", 0);
        setIntField(term277667, term277667.getClass(), "battleRankPoint", 0);
        setIntField(term277667, term277667.getClass(), "eliteRankPoint", 0);
        setIntField(term277667, term277667.getClass(), "netBattle1stCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattle2ndCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattle3rdCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattle4thCount", 0);
        setIntField(term277667, term277667.getClass(), "netBattleCorrection", 0);
        setIntField(term277667, term277667.getClass(), "netBattleErrCnt", 0);
        setIntField(term277667, term277667.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term277667, term277667.getClass(), "battleRewardStatus", 0);
        setIntField(term277667, term277667.getClass(), "battleRewardIndex", 0);
        setIntField(term277667, term277667.getClass(), "battleRewardCount", 0);
        setIntField(term277667, term277667.getClass(), "ext1", 0);
        setIntField(term277667, term277667.getClass(), "ext2", 0);
        setIntField(term277667, term277667.getClass(), "ext3", 0);
        setIntField(term277667, term277667.getClass(), "ext4", 0);
        setIntField(term277667, term277667.getClass(), "ext5", 0);
        setIntField(term277667, term277667.getClass(), "ext6", 0);
        setIntField(term277667, term277667.getClass(), "ext7", 0);
        setIntField(term277667, term277667.getClass(), "ext8", 0);
        setIntField(term277667, term277667.getClass(), "ext9", 0);
        setIntField(term277667, term277667.getClass(), "ext10", 0);
        setField(term277667, term277667.getClass(), "extStr1", null);
        setField(term277667, term277667.getClass(), "extStr2", null);
        setLongField(term277667, term277667.getClass(), "extLong1", 0L);
        setLongField(term277667, term277667.getClass(), "extLong2", 0L);
        setField(term277667, term277667.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term277667, term277667.getClass(), "isNetBattleHost", false);
        setIntField(term277667, term277667.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term277667, args);
    }

};


