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

public class UserData_getCharaIllustId_2008841194271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4216965;

    public UserData_getCharaIllustId_2008841194271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4216965 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4216965, term4216965.getClass(), "id", 0L);
        setField(term4216965, term4216965.getClass(), "card", null);
        setField(term4216965, term4216965.getClass(), "userName", null);
        setIntField(term4216965, term4216965.getClass(), "level", 0);
        setIntField(term4216965, term4216965.getClass(), "reincarnationNum", 0);
        setField(term4216965, term4216965.getClass(), "exp", null);
        setLongField(term4216965, term4216965.getClass(), "point", 0L);
        setLongField(term4216965, term4216965.getClass(), "totalPoint", 0L);
        setIntField(term4216965, term4216965.getClass(), "playCount", 0);
        setIntField(term4216965, term4216965.getClass(), "multiPlayCount", 0);
        setIntField(term4216965, term4216965.getClass(), "playerRating", 0);
        setIntField(term4216965, term4216965.getClass(), "highestRating", 0);
        setIntField(term4216965, term4216965.getClass(), "nameplateId", 0);
        setIntField(term4216965, term4216965.getClass(), "frameId", 0);
        setIntField(term4216965, term4216965.getClass(), "characterId", 0);
        setIntField(term4216965, term4216965.getClass(), "trophyId", 0);
        setIntField(term4216965, term4216965.getClass(), "playedTutorialBit", 0);
        setIntField(term4216965, term4216965.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4216965, term4216965.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4216965, term4216965.getClass(), "totalMapNum", 0);
        setLongField(term4216965, term4216965.getClass(), "totalHiScore", 0L);
        setLongField(term4216965, term4216965.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4216965, term4216965.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4216965, term4216965.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4216965, term4216965.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4216965, term4216965.getClass(), "totalUltimaHighScore", 0L);
        setField(term4216965, term4216965.getClass(), "eventWatchedDate", null);
        setIntField(term4216965, term4216965.getClass(), "friendCount", 0);
        setField(term4216965, term4216965.getClass(), "firstGameId", null);
        setField(term4216965, term4216965.getClass(), "firstRomVersion", null);
        setField(term4216965, term4216965.getClass(), "firstDataVersion", null);
        setField(term4216965, term4216965.getClass(), "firstPlayDate", null);
        setField(term4216965, term4216965.getClass(), "lastGameId", null);
        setField(term4216965, term4216965.getClass(), "lastRomVersion", null);
        setField(term4216965, term4216965.getClass(), "lastDataVersion", null);
        setField(term4216965, term4216965.getClass(), "lastLoginDate", null);
        setField(term4216965, term4216965.getClass(), "lastPlayDate", null);
        setIntField(term4216965, term4216965.getClass(), "lastPlaceId", 0);
        setField(term4216965, term4216965.getClass(), "lastPlaceName", null);
        setField(term4216965, term4216965.getClass(), "lastRegionId", null);
        setField(term4216965, term4216965.getClass(), "lastRegionName", null);
        setField(term4216965, term4216965.getClass(), "lastAllNetId", null);
        setField(term4216965, term4216965.getClass(), "lastClientId", null);
        setField(term4216965, term4216965.getClass(), "lastCountryCode", null);
        setField(term4216965, term4216965.getClass(), "userNameEx", null);
        setField(term4216965, term4216965.getClass(), "compatibleCmVersion", null);
        setIntField(term4216965, term4216965.getClass(), "medal", 0);
        setIntField(term4216965, term4216965.getClass(), "mapIconId", 0);
        setIntField(term4216965, term4216965.getClass(), "voiceId", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarWear", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarHead", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarFace", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarSkin", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarItem", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarFront", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarBack", 0);
        setIntField(term4216965, term4216965.getClass(), "classEmblemBase", 0);
        setIntField(term4216965, term4216965.getClass(), "classEmblemMedal", 0);
        setIntField(term4216965, term4216965.getClass(), "stockedGridCount", 0);
        setIntField(term4216965, term4216965.getClass(), "exMapLoopCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattlePlayCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattleWinCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattleLoseCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4216965, term4216965.getClass(), "charaIllustId", 0);
        setIntField(term4216965, term4216965.getClass(), "skillId", 0);
        setIntField(term4216965, term4216965.getClass(), "overPowerPoint", 0);
        setIntField(term4216965, term4216965.getClass(), "overPowerRate", 0);
        setIntField(term4216965, term4216965.getClass(), "overPowerLowerRank", 0);
        setIntField(term4216965, term4216965.getClass(), "avatarPoint", 0);
        setIntField(term4216965, term4216965.getClass(), "battleRankId", 0);
        setIntField(term4216965, term4216965.getClass(), "battleRankPoint", 0);
        setIntField(term4216965, term4216965.getClass(), "eliteRankPoint", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattle1stCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattle2ndCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattle3rdCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattle4thCount", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattleCorrection", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattleErrCnt", 0);
        setIntField(term4216965, term4216965.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4216965, term4216965.getClass(), "battleRewardStatus", 0);
        setIntField(term4216965, term4216965.getClass(), "battleRewardIndex", 0);
        setIntField(term4216965, term4216965.getClass(), "battleRewardCount", 0);
        setIntField(term4216965, term4216965.getClass(), "ext1", 0);
        setIntField(term4216965, term4216965.getClass(), "ext2", 0);
        setIntField(term4216965, term4216965.getClass(), "ext3", 0);
        setIntField(term4216965, term4216965.getClass(), "ext4", 0);
        setIntField(term4216965, term4216965.getClass(), "ext5", 0);
        setIntField(term4216965, term4216965.getClass(), "ext6", 0);
        setIntField(term4216965, term4216965.getClass(), "ext7", 0);
        setIntField(term4216965, term4216965.getClass(), "ext8", 0);
        setIntField(term4216965, term4216965.getClass(), "ext9", 0);
        setIntField(term4216965, term4216965.getClass(), "ext10", 0);
        setField(term4216965, term4216965.getClass(), "extStr1", null);
        setField(term4216965, term4216965.getClass(), "extStr2", null);
        setLongField(term4216965, term4216965.getClass(), "extLong1", 0L);
        setLongField(term4216965, term4216965.getClass(), "extLong2", 0L);
        setField(term4216965, term4216965.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4216965, term4216965.getClass(), "isNetBattleHost", false);
        setIntField(term4216965, term4216965.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaIllustId", argTypes, term4216965, args);
    }

};


