package com.hfag.project42.melEra;

import com.hfag.project42.R;

public class MelEra {
    private String name;
    private String detail;
    private int imageResourcesId;
    private String firstDescription;
    private String description;

    public static final MelEra[] melas = {
            new MelEra("Анкилозавр",
                    "Поздний меловой период\n" +
                            "6 м в длину\n" +
                            "2 тонны\n" +
                            "1908 г., Канада\n" +
                            "Спаянный ящер",
                    R.drawable.ankilozavr ,
                    "Иногда его описывают как живой танк, поскольку " + "все тело ящера было заковано в чрезвычайно " +
                            "прочную броню. Анкилозавр всегда мог " + "попытаться противостоять нападению даже " +
                            "самых свирепых и голодных хищников.",
                    "Тело у анкилозавра, несомненно, было " + "довольно массивным. Кроме этого, у него " +
                            "имелась прочная костяная броня, " + "покрывавшая всю верхнюю часть " +
                            "туловища и хвоста. Эта броня " + "складывалась из множества мелких " +
                            "костяных пластинок или бляшек, вросших " + "в кожу анкилозавра. В качестве " +
                            "дополнительной защиты в центре каждого " + "такого нароста имелось шипаобразное " +
                            "утолщение. Наросты были покрыты " + "роговыми чешуйками и спаяны " +
                            "(соединены) друг с другом длинными " + "полосами, что является одной " +
                            "из причин, по которой этого " + "динозавра именуют " +
                            "анкилазавром - <<спаянным " + "ящером>>. " +
                            "Как вы, наверное, уже " + "догадались, броня была" + "очень тяжелой."
                    ),
            new MelEra("Хазмозавр",
                    "Поздний меловой период\n" +
                            "5,2 м в длину\n" +
                            "2-5 тонн\n" +
                            "1902 г., Канада\n" +
                            "Ящер, разбивающий преграды",
                    R.drawable.hazmozavr ,
                    "Хазмозавр относится к отряду динозавров, " + "именуемых цератопсидами; его легко  " +
                            "отличить по характерному " + "воротникаобразному выросту на голове. " +
                            "Чем больше был <<воротник>> у самца, тем " + "больше <<авторитета>> он, вероятно, имел в " + "стаде хазмозавров.",
                    "Скелет у хазмозавра был очень " + "прочным -он должен был выдерживать " +
                            "вес массивного тела и огромного шейного " + "<<воротника>>. Строение тела не " +
                            "способствовало быстроте передвижения, " + "и, несмотря на мощные мускулы, " +
                            "приводившие в движение задние и " + "передние конечности, хазмозавр, " +
                            "очевидно, двигался довольно " + "медленно. " +
                            "Для того чтобы поддержать " + "силы и удовлетворить " +
                            "аппетит,хазмозавру " + "требовалось огромное " +
                            "количество пищи. Размер " + "его грудной клетки " +
                            "указывает на то, что " + "желудок у хазмозавра " + "был очень объемным."),
            new MelEra("Галлимим",
                    "Поздний меловой период\n" +
                            "6 м в длину\n" +
                            "440 кг\n" +
                            "1963 г., Монголия\n" +
                            "",
                    R.drawable.galimim ,
                    "Его часто называют страусеподобным динозавром; но он был намного крупнее " +
                            "современного страуса. Судя по скелету, гамимим, несомненно, был " +
                            "непревзойденным бегуном, о чем свидетельствуют его минные тонкие, но " +
                            "сильные ноги и уминенные, узкие кости ступней.",
                    "Существует ряд характеристик, по " + "которым галлимима легко отличить от " +
                            "других динозавров. Во-первых, его задние " + "конечности были длинными и тонкими, " +
                            "благодаря чему он мог делать необычайно " + "широкие шаги. Если вы когда-нибудь " +
                            "видели бегущего страуса, то можете " + "явственно представить себе, как быстро " +
                            "мог бегать галлимим. Длинные ноги " + "галлимима оканчивались продолговатыми " +
                            "ступнями, и это еще сильнее убедило " + "ученых в том, что галлимим мог " +
                            "развивать фантастическую"  + "скорость. " +
                            "Таким образом, в большинстве случаев " + "этот ископаемый спринтер мог удрать от " +
                            "любого напавшего на него хищника, " + "буквально за несколько мгновений оставив " +
                            "атакующего далеко позади. Несомненно, " + "такая быстрота была полезна при ловле " +
                            "разнообразной мелкой добычи, как,"  + "например, стрекоза, изображенная на " +
                            "рисунке внизу. Кроме стрекоз, галлимим, " + "вероятно, питался в основном листьями и " +
                            "ягодами, а также ящерицами и " + "землеройками, если ему " + "удавалось их поймать."),
            new MelEra("Игуанодон",
                    "Ранний меловой период\n" +
                            "9 м в длину\n" +
                            "5 тонн\n" +
                            "1822 г., Англия\n" +
                            "Зуб игуаны",
                    R.drawable.iguanodon ,
                    "Впервые останки этого ящера были случайно найдены Мэри Энн Мантем во время " +
                            "прогулки; случилось это в 1822 году в Англии; позднее останки игуанодона были " +
                            "обнаружены в угольной шахте в Бельгии.",
                    "Судя по следам, оставленным " + "игуанодонами, они жили " +
                            "стадами, и во время перекочевки " + "с места на место взрослые " +
                            "игуанодоны защищали " + "малышей. " + "Совсем маленький игуанодон мог " +
                            "передвигаться на задних ногах, но с " + "возрастом, становясь тяжелее, он " + "опускался на четвереньки." +
                    "Отличительными признаками игуанодона " + "являются клюв и оснащенные шипами " +
                            "противостоящие пальцы на передних " + "конечностях. У него были легко " +
                            "сгибающиеся внутрь короткие пальцы ими " + "можно было захватывать ветви деревьев) и " +
                            "три плоских пальца, покрытых роговым " + "слоем и сгибающихся наружу."),
            new MelEra("Паразавралоф",
                    "Поздний меловой период\n" +
                            "10 м в длину\n" +
                            "3 тонны\n" +
                            "1922 г., США\n" +
                            "Около завролоф",
                    R.drawable.parazavralof ,
                    "Этот растительноядный динозавр с утиным клювом когда-то обитал на территории " +
                            "современной Северной Америки. На голове у него имелся полый трубообразный " +
                            "вырост и возможно, у самцов он был длиннее.",
                    "Большинство палеонтологов сейчас " + "сошлись во мнении, что паразавралоф - " +
                            "гигантский травоядный ящер мелового " + "периода - мог с помощью своего полого " +
                            "гребня издавать мычание; выдувание " + "воздуха сквозь проходившие внутри " +
                            "выроста две или четыре трубки " + "производило низкий долгий звук." +
                    "В то же время вырост мог " + "выполнять и другие функции. " +
                            "Первоначально выдвинутая " + "теория предполагала, что " +
                            "полая труба мог л а " + "использоваться аналогично " +
                            "дыхательнойтрубке " + "аквалангиста при погружении " +
                            "в воду. " + "Если это предположение было верным, то " +
                            "в выросте должны были быть полости для " + "хранения запасов воздуха. Сейчас данная " +
                            "теория считается маловероятной. " + "Другое возможное объяснение состоит " +
                            "в том, что вырост мог быть присоединен " + "таким образом, что его можно было " +
                            "отклонить назад, прижав к шее " + "паразавролофа. " +
                            "Это умение могло быть " + "полезным при беге сквозь " +
                            "густые заросли, поскольку " + "прижатый таким образом " +
                            "вырост не задевал " + "нависающие ветки ."),
            new MelEra("Спинозавр",
                    "Поздний меловой период\n" +
                            "15 м в длину\n" +
                            "4 тонны\n" +
                            "1915 г., Египет\n" +
                            "Шипастый ящер",
                    R.drawable.spinozavr ,
                    "Что за странный парусообразный вырост красовался на спине у спинозавра! " +
                            "Его назначение поставило в тупик палеонтологов, когда в 1915 году в Египте были " +
                            "впервые обнаружены останки спинозавра. Но теперь ученые разработали " +
                            "интересную теорию, объясняющую, какую роль мог играть этот вырост в " +
                            "повседневной жизни динозавра.",
                    "В середине дня спинозавр мог повернуться " + "спиной к солнцу, как это изображено на " +
                            "предыдущей странице. В этом положении " + "парус>> был обращен ребром к прямым " +
                            "солнечным лучам и не впитывал тепло, " + "поэтому спинозавр, который, как и все " +
                            "пресмыкающиеся, был холоднокровным, " + "избегал риска перегрева. Если же ему " +
                            "вдруг становилось слишком жарко, то он " + "мог нырнуть в ближайшее озеро или реку и " +
                            "обмакнуть свой <<парус>> в воду, чтобы его " + "охладить." +
                            "Ранним утром даже в теплом климате " + "мелового периода температура, вероятно, " +
                            "была не столь высокой, как днем. " + "Возможно, что на рассвете спинозавру " +
                            "было даже зябко. Тогда он мог встать так, " + "чтобы на плоскость <<паруса>> падали " +
                            "солнечные лучи, как показано на " + "иллюстрации внизу. " +
                            "Существует и другая теория, по которой " + "считается, что <<парус>> в брачный период " +
                            "мог служить средством привлечения " + "самок."),
            new MelEra("Тираннозавр Рекс",
                    "Поздний меловой период\n" +
                            "12 м в длину\n" +
                            "7 тонн\n" +
                            "1902 г., США\n" +
                            "Король ящеров-тиранов",
                    R.drawable.tiran ,
                    "Тираннозавр Рекс был одним из самых свирепых хищников, когда-либо живших на " +
                            "планете Земля . Окажись рядом с ним, вы едва смогли бы дотянуться до его колена . " +
                            "Каким ужасным монстром он был!",
                    "Первыми найденными останками " + "тираннозавра были части черепа и " +
                            "челюстей, лопатка, кости бедра и голени. " + "Уже по этим костям Осборн смог " +
                            "установить, каким громадным был " + "динозавр. " +
                            "Тираннозавр рекс, несомненно, был " + "огромным и чрезвычайно тяжелым " +
                            "ящером. Его массивным задним ногам " + "приходилось выдерживать невероятную " +
                            "нагрузку- ведь вес его тела " + "приближался к 7 тоннам!" +
                            "Тираннозавр реке- один из последних " + "динозавров, обитавших на территории " +
                            "современной Северной Америки. " + "Настоящих врагов среди прочих " +
                            "динозавров у него не было; своими " + "мощными челюстями он мог нанести рану " +
                            "длиной в метр. Хелл-Крик (Адский Ручей), " + "где были найдены останки тираннозавра, " +
                            "судя по названию, являлся самым " + "подходящим местом для обитания такой " + "твари."),
    };

    public MelEra(String name,String detail, int imageResourcesId, String firstDescription, String description) {
        this.name = name;
        this.detail = detail;
        this.imageResourcesId = imageResourcesId;
        this.firstDescription = firstDescription;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDetail() { return detail; }

    public int getImageResourcesId() {
        return imageResourcesId;
    }

    public String getFirstDescription() {
        return firstDescription;
    }

    public String getDescription() {
        return description;
    }
}