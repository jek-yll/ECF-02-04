package com.ut.ecommerce.commondataservice.model;

import com.ut.ecommerce.commondataservice.dto.SearchSuggestionForThreeAttrDTO;
import com.ut.ecommerce.commondataservice.dto.SearchSuggestionForTwoAttrDTO;
import com.ut.ecommerce.commondataservice.entity.sql.categories.ApparelCategory;
import com.ut.ecommerce.commondataservice.entity.sql.categories.GenderCategory;
import com.ut.ecommerce.commondataservice.entity.sql.categories.ProductBrandCategory;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SearchSuggestionResponse implements Serializable {
    List<GenderCategory> genderKeywords;
    List<ProductBrandCategory> brandKeywords;
    List<ApparelCategory> apparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderApparelKeywords;
    List<SearchSuggestionForTwoAttrDTO> genderBrandKeywords;
    List<SearchSuggestionForTwoAttrDTO> apparelBrandKeywords;
    List<SearchSuggestionForThreeAttrDTO> threeAttrKeywords;
    List<String> productKeywords;
}
